import sqlite3  # For database management
import requests  # For fetching API data
import matplotlib.pyplot as plt  # For generating charts
import getpass # To securely take user input

# Database Class
class Database:
    def __init__(self, db_name="lab9.db"):
        self.conn = sqlite3.connect(db_name)
        self.cursor = self.conn.cursor()
        self.create_table()
    
    def create_table(self):
        # Creates table if it doesn't exist
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
        # Saves API data to the database
        if not isinstance(data, list) or not all(isinstance(d, dict) for d in data):
            print("Error: Data must be a list of dictionaries!")
            return
        
        # Inserts API data into the database
        self.cursor.executemany('''
            INSERT INTO api_data (userId, title, body) VALUES (?, ?, ?)
        ''', [(d.get("userId", 0), d.get("title", "No Title"), d.get("body", "No Body")) for d in data])
        self.conn.commit()
    
    def get_data(self):
        # Fetches all data from the database
        self.cursor.execute("SELECT * FROM api_data")
        return self.cursor.fetchall()

# Fetch API Data
def fetch_api_data():
    url = "https://jsonplaceholder.typicode.com/posts"
    response = requests.get(url)
   
#   try:
#       data = response.json()  # Convert API response to JSON
#       if isinstance(data, list):  # If it's a list, convert to a dictionary
#           user_posts = {post["id"]: len(post["title"]) for post in data[:10]}  # Example dictionary
#           return user_posts
#       return data  # Already a dictionary
#   except ValueError:
#       print("Error: API response is not JSON.")
#        return {} 
   
    try:
        data = response.json()  # Convert response to JSON
        if isinstance(data, list) and all(isinstance(d, dict) for d in data):  # Ensure it's a list of dictionaries
            return data[:10]  # Return first 10 posts
        else:
            print("Error: Unexpected data format. Expected a list of dictionaries.")
            return []  # Return an empty list if data is invalid
    except ValueError:
        print("Error: API response is not JSON.")
        return []

# Plot Data from Database
def plot_data():
    db = Database()
    data = db.get_data()
    user_posts = {}
    for row in data:
        user_posts[row[1]] = user_posts.get(row[1], 0) + 1
    
    plt.bar(user_posts.keys(), user_posts.values())
    plt.xlabel("User ID")
    plt.ylabel("Number of Posts")
    plt.title("Posts per User")
    plt.show()

# Login System
class Login:
    def __init__(self, db_name="users.db"):
        self.conn = sqlite3.connect(db_name)
        self.cursor = self.conn.cursor()
        self.create_table()
    
    def create_table(self):
        """Create users table if it doesn't exist."""
        self.cursor.execute('''
            CREATE TABLE IF NOT EXISTS users (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                username TEXT UNIQUE,
                password TEXT
            )
        ''')
        self.conn.commit()
    
    def signup(self, username, password):
        try:
            self.cursor.execute('INSERT INTO users (username, password) VALUES (?, ?)', (username, password))
            self.conn.commit()
            print("Signup successful! You can now log in.")
        except sqlite3.IntegrityError:
            print("Username already exists. Please try a different one.")
    
    def login(self, username, password):
        self.cursor.execute("SELECT * FROM users WHERE username=? AND password=?", (username, password))
        user = self.cursor.fetchone()
        return user is not None  # Returns True if user exists, else False

def main():
    auth = Login()  # Initialize authentication system

    while True:
        print("Welcome! Choose an option:")
        print("1. Signup")
        print("2. Login")
        print("3. Exit")

        choice = input("\nEnter choice: ")

        if choice == "1":
            username = input("Enter username: ")
            password = getpass.getpass("Enter password: ")  # Hides password input
            auth.signup(username, password)

        elif choice == "2":
            username = input("Enter username: ")
            password = getpass.getpass("Enter password: ")

            if auth.login(username, password):
                print("Login successful! Welcome,", username)
                
                # User is now logged in
                while True:
                    print("Choose an action:")
                    print("1. View Dashboard")
                    print("2. Logout")

                    action = input("\nEnter action: ")

                    if action == "1":
                        print("Dashboard: Here you can interact with the application!")
                    elif action == "2":
                        print("Logging out")
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
    
    db = Database()
    db.create_table()
    data = fetch_api_data()
    if data:
        db.save_data(data)
        print("Data saved to database.")
    else:
        print("Failed to fetch data.")
    
    plot_data()
    
    
    #auth = Login()
    #auth.signup("testuser", "password123")
    #auth.login("testuser", "password123")
    
    
