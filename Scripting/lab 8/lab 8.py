# Importing necessary libraries
import requests
from requests.exceptions import HTTPError
from bs4 import BeautifulSoup
import matplotlib.pyplot as plt
import json

# Part 1: JioSaavnAPI Integration
api_url = "https://saavn.me/search/songs?query=arijit%20singh&limit=10"  # Replace with your desired search query

try:
    # Fetch data from the API
    response = requests.get(api_url)
    response.raise_for_status()
    data = response.json()

    # Extract relevant data (e.g., top 10 songs and their popularity score)
    songs = data.get("data", {}).get("results", [])
    if not songs:
        raise ValueError("No data found in the API response.")

    song_titles = [song.get("title", "Unknown") for song in songs]
    song_playcounts = [int(song.get("playCount", 0)) for song in songs]

    # Visualize the data
    plt.figure(figsize=(10, 6))
    plt.bar(song_titles, song_playcounts, color="skyblue")
    plt.xlabel("Songs")
    plt.ylabel("Play Counts")
    plt.title("Top 10 Songs (Arijit Singh) on JioSaavn")
    plt.xticks(rotation=45, ha="right")
    plt.tight_layout()
    plt.savefig("jiosaavn_top_songs.png")
    plt.show()

except HTTPError as http_err:
    print(f"HTTP error occurred: {http_err}")
except ValueError as val_err:
    print(f"Value error: {val_err}")
except Exception as err:
    print(f"Other error occurred: {err}")


# Part 2: Scraping Dwarven Weapons Data
wiki_url = "https://elderscrolls.fandom.com/wiki/Dwarven_Weapons_(Skyrim)"
try:
    # Fetch the webpage content
    response = requests.get(wiki_url)
    response.raise_for_status()
    soup = BeautifulSoup(response.content, "html.parser")

    # Extract the table data
    table = soup.find("table", class_="wikitable")
    if not table:
        raise ValueError("Could not find the required table on the wiki page.")

    rows = table.find_all("tr")

    # Parse weapon data
    weapon_names = []
    weapon_damages = []
    weapon_weights = []

    for row in rows[1:]:  # Skip the header row
        cols = row.find_all("td")
        if len(cols) > 2:
            weapon_names.append(cols[0].text.strip())
            try:
                weapon_damages.append(float(cols[1].text.strip()))
                weapon_weights.append(float(cols[2].text.strip()))
            except ValueError:
                print(f"Skipping invalid data in row: {cols}")

    # Visualize weapon data
    plt.figure(figsize=(10, 6))
    plt.scatter(weapon_weights, weapon_damages, color="gold", edgecolor="black")
    plt.xlabel("Weight")
    plt.ylabel("Damage")
    plt.title("Dwarven Weapons: Damage vs Weight")
    for i, name in enumerate(weapon_names):
        plt.text(weapon_weights[i], weapon_damages[i], name, fontsize=8)
    plt.grid(True)
    plt.tight_layout()
    plt.savefig("dwarven_weapons_plot.png")
    plt.show()

except HTTPError as http_err:
    print(f"HTTP error occurred: {http_err}")
except Exception as err:
    print(f"Error scraping the wiki page: {err}")
