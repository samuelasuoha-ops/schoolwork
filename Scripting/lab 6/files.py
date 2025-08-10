# student number: C00305107
# Name: Samuel Asuoha
 
# This function will read the user data and return it as a dictionary
def load_users():
    users = {}
    try:
        with open("users.txt", "r") as file:
            for line in file:
                username, name, password = line.strip().split(":")
                users[username] = {'name': name, 'password': password}
    except FileNotFoundError:
        # If the file doesn't exist, start with an empty dictionary
        pass
    return users

# This writes each user's data in a format that can be reloaded later
def save_users(users):
    with open("users.txt", "w") as file:
        for username, info in users.items():
            file.write(f"{username}:{info['name']}:{info['password']}\n")

# This is a function to sign up a new user
def sign_up():
    users = load_users()
    name = input("Add name: ")
    username = input("Add username: ")
    # This checks if the username is already taken
    if username in users:
        print("Error: Username already exists.")
        return
    password = input("Add password: ")
    users[username] = {'name': name, 'password': password}
    save_users(users)
    print(f"{username} has been added")

# This is a function to log in an existing user
def login():
    users = load_users()
    username = input("Enter username: ")
    # This checks if the username exists
    if username not in users:
        print("Error: Username does not exist.")
        return
    # This prompts for password until correct password is entered
    while True:
        password = input("Enter password: ")
        if users[username]['password'] == password:
            print(f"Hello welcome back {users[username]['name']}")
            break
        else:
            print("Wrong password, Enter password:")

# This is a function to initialize a poll with predefined options, setting vote count to zero
def initialize_poll():
    options = {
        "Apple": 0,
        "Banana": 0,
        "Pineapple": 0,
        "Tomato": 0,
        "Pear": 0,
        "Grape": 0
    }
    with open("poll.txt", "w") as file:
        for option, count in options.items():
            file.write(f"{option}:{count}\n")

# This is a function to cast a vote for a selected option
def vote():
    poll_data = {}
    with open("poll.txt", "r") as file:
        for line in file:
            option, count = line.strip().split(":")
            poll_data[option] = int(count)

    # This displays options to the user
    print("Hi, what's your favourite fruit")
    for idx, option in enumerate(poll_data.keys(), 1):
        print(f"{idx} : {option}")

    # This gets user's choice by number and find the corresponding option
    choice = int(input())
    selected_option = list(poll_data.keys())[choice - 1]
    print(f"You have picked {selected_option}")

    # This updates the selected option's count
    poll_data[selected_option] += 1

    # This saves the updated poll data back to the file
    with open("poll.txt", "w") as file:
        for option, count in poll_data.items():
            file.write(f"{option}:{count}\n")

# This is a function to display the current poll results
def show_results():
    print("Poll Results:")
    with open("poll.txt", "r") as file:
        for line in file:
            option, count = line.strip().split(":")
            # This is a different message for "Tomato" option as shown in the sample output
            print(f"{count} people have picked {option}" if option != "Tomato" else f"{count} weirdo picked {option}")


# Main Program 
def main():
    # This initializes the poll with default options and counts
    initialize_poll()

    # This is the main loop for user selection of login, sign-up, and poll
    while True:
        # This prompts for login or sign-up
        choice = input("Welcome, press L to login, press S to Signup: ").upper()
        if choice == 'L':
            login()
        elif choice == 'S':
            sign_up()
        else:
            print("Invalid choice. Please choose 'L' or 'S'.")

        # This asks the user if they want to participate in the poll
        participate = input("Would you like to participate in the poll? (Y/N): ").upper()
        if participate == 'Y':
            # This allows the user to vote and results are displayed
            vote()
            show_results()
        else:
            # This is a message after the programe ends
            print("Exiting the program.")
            break

if __name__ == "__main__":
    main()

