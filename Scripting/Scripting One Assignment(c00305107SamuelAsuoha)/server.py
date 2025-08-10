# Name: Samuel Asuoha
# student number: c00305107

import socket
import threading
import os
from datetime import datetime

# This the directory to store chatroom files
CHATROOMS_DIR = "chatrooms"
if not os.path.exists(CHATROOMS_DIR):
    os.makedirs(CHATROOMS_DIR)

# This is the dictionary to manage connected clients in chatrooms
clients = {}
clients_lock = threading.Lock()

# These are to handle clients and messages
def handle_client(client_socket, client_address):
    username = authenticate(client_socket)
    if not username:
        client_socket.close()
        return

    send_message(client_socket, "Welcome to the Chatroom System!")
    while True:
        send_message(client_socket, "Available chatrooms:")
        chatrooms = list_chatrooms()
        send_message(client_socket, "\n".join(f"{i+1}. {chatroom}" for i, chatroom in enumerate(chatrooms)))
        send_message(client_socket, "Enter a chatroom name to join, or 'create <name>' to create a new one:")

        choice = client_socket.recv(1024).decode().strip()
        if choice.startswith("create "):
            chatroom_name = choice.split(" ", 1)[1]
            create_chatroom(chatroom_name)
            send_message(client_socket, f"Chatroom '{chatroom_name}' created!")
        elif choice in chatrooms:
            join_chatroom(client_socket, username, choice)
        else:
            send_message(client_socket, "Invalid input. Try again.")

def authenticate(client_socket):
    while True:
        send_message(client_socket, "Do you have an account? (yes/no)")
        response = client_socket.recv(1024).decode().strip().lower()

        if response == "yes":
            send_message(client_socket, "Enter username:")
            username = client_socket.recv(1024).decode().strip()
            send_message(client_socket, "Enter password:")
            password = client_socket.recv(1024).decode().strip()

            if validate_credentials(username, password):
                send_message(client_socket, "Login successful!")
                return username
            else:
                send_message(client_socket, "Invalid username or password. Try again.")
        elif response == "no":
            send_message(client_socket, "Enter a new username:")
            username = client_socket.recv(1024).decode().strip()
            send_message(client_socket, "Enter a new password:")
            password = client_socket.recv(1024).decode().strip()

            if register_user(username, password):
                send_message(client_socket, "Registration successful! You can now log in.")
            else:
                send_message(client_socket, "Username already exists. Try again.")

def validate_credentials(username, password):
    if not os.path.exists("users.txt"):
        return False
    with open("users.txt", "r") as f:
        for line in f:
            stored_username, stored_password = line.strip().split(":")
            if stored_username == username and stored_password == password:
                return True
    return False

def register_user(username, password):
    if not os.path.exists("users.txt"):
        with open("users.txt", "w") as f:
            pass
    with open("users.txt", "r") as f:
        for line in f:
            stored_username, _ = line.strip().split(":")
            if stored_username == username:
                return False
    with open("users.txt", "a") as f:
        f.write(f"{username}:{password}\n")
    return True

def send_message(client_socket, message):
    client_socket.send(f"{message}\n".encode())

def list_chatrooms():
    return [f[:-4] for f in os.listdir(CHATROOMS_DIR) if f.endswith(".txt")]

def create_chatroom(chatroom_name):
    with open(os.path.join(CHATROOMS_DIR, f"{chatroom_name}.txt"), "w") as f:
        f.write("Chatroom created.\n")

def join_chatroom(client_socket, username, chatroom_name):
    chatroom_path = os.path.join(CHATROOMS_DIR, f"{chatroom_name}.txt")
    send_message(client_socket, f"Joining chatroom '{chatroom_name}'...")

    # This would display chat history
    with open(chatroom_path, "r") as f:
        send_message(client_socket, f.read())

    # This adds client to chatroom
    with clients_lock:
        if chatroom_name not in clients:
            clients[chatroom_name] = []
        clients[chatroom_name].append((client_socket, username))

    # This notifies all users in the chatroom about the new user
    broadcast_message(chatroom_name, f"[SYSTEM] {username} has joined the chatroom.")

    # This adds client to chatroom and handle messages
    send_message(client_socket, f"You are now in chatroom '{chatroom_name}'. Type 'exit' to leave.")
    while True:
        message = client_socket.recv(1024).decode().strip()
        if message.lower() == "exit":
            send_message(client_socket, f"Leaving chatroom '{chatroom_name}'...")
            broadcast_message(chatroom_name, f"[SYSTEM] {username} has left the chatroom.")
            break

        # This formats message with timestamp
        timestamp = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
        formatted_message = f"[{timestamp}] {username}: {message}"

        
        broadcast_message(chatroom_name, formatted_message)
        with open(chatroom_path, "a") as f:
            f.write(formatted_message + "\n")
            
    # This removes client from chatroom
    with clients_lock:
        if chatroom_name in clients:
            if (client_socket, username) in clients[chatroom_name]:
                clients[chatroom_name].remove((client_socket, username))
                # If the chatroom is empty, you can optionally delete it
                if not clients[chatroom_name]:
                    del clients[chatroom_name]

#  this is the broadcast message function
def broadcast_message(chatroom_name, message, username=None):
    # This would get the current time
    current_time = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    
    # This would format the message
    if username:
        formatted_message = f"[{current_time}] {username}: {message}"
    else:
        formatted_message = f"[{current_time}] {message}"
    
    # This would send the formatted message to all connected clients in the chatroom
    for client, _ in clients[chatroom_name]:
        client.sendall(formatted_message.encode())
    
    # This would save the formatted message to the chatroom file for history
    with open(os.path.join(CHATROOMS_DIR, f"{chatroom_name}.txt"), "a") as f:
        f.write(formatted_message + "\n")


# The server setup
def start_server():

    # This sets up the server
    server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server_address = ('127.0.0.1', 5000)  # Localhost and port
    server.bind(server_address)
    server.listen(5)

    print("Server listening on port 5000...")

    while True:
        client_socket, client_address = server.accept()
        print(f"New connection from {client_address}")
        threading.Thread(target=handle_client, args=(client_socket, client_address), daemon=True).start()

if __name__ == "__main__":
    start_server()
