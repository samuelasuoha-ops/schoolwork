# Name: Samuel Asuoha
# student number: c00305107

import socket
import threading

# This continuously receives and displays messages from the server.
def receive_messages(client_socket):
    while True:
        try:
            message = client_socket.recv(1024).decode()
            if message:
                print(message)
            else:
                print("Connection closed by the server.")
                break
        except Exception as e:
            print(f"Error receiving message: {e}")
            break

# This to start the client, connect to the server, and handle sending/receiving messages.
def start_client():
    try:
        # This would connect to the server
        client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        client.connect(("127.0.0.1", 5000))
        print("Connected to the server.")

        # This would start a thread to receive messages from the server
        threading.Thread(target=receive_messages, args=(client,), daemon=True).start()

        # This would continuously send messages to the server
        while True:
            try:
                message = input()
                client.send(message.encode())
                if message.lower() == "exit":
                    print("Exiting chat...")
                    break
            except Exception as e:
                print(f"Error sending message: {e}")
                break

    except Exception as e:
        print(f"Unable to connect to the server: {e}")
    finally:
        client.close()
        print("Disconnected from the server.")

if __name__ == "__main__":
    start_client()
 
