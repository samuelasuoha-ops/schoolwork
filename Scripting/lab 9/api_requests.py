import requests

url = "https://jsonplaceholder.typicode.com/posts"

try:
    response = requests.get(url)
    response.raise_for_status()  # Raises an error if the request failed
    data = response.json()
    print("API Data:", data[:5])  # Print first 5 items to verify structure
except requests.exceptions.RequestException as e:
    print("Error fetching data:", e)