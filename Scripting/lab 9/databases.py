# Name: Samuel Asuoha
# Student ID C00305107

import sqlite3  # For database management
import requests  # For fetching API data
import matplotlib.pyplot as plt  # For generating charts
import getpass  # To securely take user input
import hashlib  # For password hashing

# Database Class
class Database:
    def __init__(self, db_name="lab9.db"):
        self.conn = sqlite3.connect(db_name)
        self.cursor = self.conn.cursor()
        self.create_table()

    def create_table(self):
        """Creates a table if it doesn't exist."""
        self.cursor.execute('''
            CREATE TABLE IF NOT EXISTS posts (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                userId INTEGER,
                title TEXT,
                body TEXT
            )
        ''')
        self.conn.commit()

    def save_data(self, data):
        """Saves API data to the database."""
        if not isinstance(data, list) or not all(isinstance(d, dict) for d in data):
            print("Error: Data must be a list of dictionaries!")
            return

        self.cursor.executemany('''
            INSERT INTO posts (userId, title, body) VALUES (?, ?, ?)
        ''', [(d.get("userId", 0), d.get("title", "No Title"), d.get("body", "No Body")) for d in data])
        self.conn.commit()

    def get_data(self):
        """Fetches all data from the database."""
        self.cursor.execute("SELECT userId, COUNT(*) FROM posts GROUP BY userId")
        return dict(self.cursor.fetchall())

# Fetch API Data
def fetch_api_data():
    """Fetches data from a sample API."""
    url = "https://jsonplaceholder.typicode.com/posts"
    try:
        response = requests.get(url)
        if response.status_code == 200:
            data = response.json()
            return data[:10] if isinstance(data, list) else []
        else:
            print("Error: Failed to fetch API data. Status code:", response.status_code)
            return []
    except requests.RequestException as e:
        print("Error: Unable to fetch data due to:", e)
        return []

# Plot Data from Database
def plot_data():
    """Generates a bar chart for user post counts."""
    db = Database()
    user_posts = db.get_data()
    
    if not user_posts:
        print("No data available to plot.")
        return

    plt.bar(user_posts.keys(), user_posts.values())
    plt.xlabel("User ID")
    plt.ylabel("Number of Posts")
    plt.title("Posts per User")
    plt.show()

# Secure Password Hashing
def hash_password(password):
    """Hashes a password using SHA-256."""
    return hashlib.sha256(password.encode()).hexdigest()

# Login System
class Login:
    def __init__(self, db_name="users.db"):
        self.conn = sqlite3.connect(db_name)
        self.cursor = self.conn.cursor()
        self.create_table()

    def create_table(self):
        """Creates a users table if it doesn't exist."""
        self.cursor.execute('''
            CREATE TABLE IF NOT EXISTS users (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                username TEXT UNIQUE,
                password TEXT
            )
        ''')
        self.conn.commit()

    def signup(self, username, password):
        """Registers a new user."""
        try:
            hashed_pw = hash_password(password)
            self.cursor.execute('INSERT INTO users (username, password) VALUES (?, ?)', (username, hashed_pw))
            self.conn.commit()
            print("Signup successful! You can now log in.")
        except sqlite3.IntegrityError:
            print("Username already exists. Please try a different one.")

    def login(self, username, password):
        """Authenticates a user."""
        hashed_pw = hash_password(password)
        self.cursor.execute("SELECT * FROM users WHERE username=? AND password=?", (username, hashed_pw))
        return self.cursor.fetchone() is not None

def main():
    auth = Login()  # Initialize authentication system

    while True:
        print("\nWelcome! Choose an option:")
        print("1. Signup")
        print("2. Login")
        print("3. Exit")

        choice = input("\nEnter choice: ")

        if choice == "1":
            username = input("Enter username: ")
            password = getpass.getpass("Enter password: ")
            auth.signup(username, password)

        elif choice == "2":
            username = input("Enter username: ")
            password = getpass.getpass("Enter password: ")

            if auth.login(username, password):
                print("Login successful! Welcome,", username)
                
                while True:
                    print("\nChoose an action:")
                    print("1. Fetch & Save Data")
                    print("2. View Dashboard")
                    print("3. Logout")

                    action = input("\nEnter action: ")

                    if action == "1":
                        db = Database()
                        data = fetch_api_data()
                        if data:
                            db.save_data(data)
                            print("Data saved to database.")
                        else:
                            print("Failed to fetch data.")

                    elif action == "2":
                        plot_data()

                    elif action == "3":
                        print("Logging out...")
                        break
                    else:
                        print("Invalid choice! Try again.")

            else:
                print("Login failed! Incorrect username or password.")

        elif choice == "3":
            print("Exiting... Goodbye!")
            break

        else:
            print("Invalid choice! Try again.")

# Main Execution
if __name__ == "__main__":
    main()
