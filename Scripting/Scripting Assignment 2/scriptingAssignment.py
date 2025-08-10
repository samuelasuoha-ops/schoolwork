# Name: Samuel Asuoha 
# Student ID: C00305107
import requests
import sqlite3
import matplotlib.pyplot as plt
import time
import schedule
import seaborn as sns
import pandas as pd
from tabulate import tabulate

# WeatherAPI Key
API_KEY = "d733f94e996549508ba01646251103"

# WeatherAPI Endpoint
CITY = "Dublin"
URL = f"http://api.weatherapi.com/v1/current.json?key={API_KEY}&q={CITY}"

# Function to fetch weather data from WeatherAPI
def fetch_weather():
    response = requests.get(URL)
    
    if response.status_code != 200:
        print(f"Failed to fetch data: {response.status_code}")
        return None, None

    data = response.json()
    
    try:
        temp = data["current"]["temp_c"]  # Temperature in Celsius
        precip = data["current"]["precip_mm"]  # Precipitation in mm
    except KeyError:
        print("Error extracting weather data.")
        return None, None

    return temp, precip

# Function to create and connect to SQLite database
def create_database():
    conn = sqlite3.connect('weather_data.db')
    cursor = conn.cursor()
    cursor.execute('''
        CREATE TABLE IF NOT EXISTS weather (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            date TEXT UNIQUE,
            temperature REAL,
            precipitation REAL
        )
    ''')
    conn.commit()
    return conn

# Function to insert data into the database
def insert_data(conn, date, temp, precip):
    if temp is None or precip is None:
        print("Skipping database insert due to missing data.")
        return
    
    cursor = conn.cursor()
    cursor.execute('''
        INSERT OR IGNORE INTO weather (date, temperature, precipitation) 
        VALUES (?, ?, ?)
    ''', (date, temp, precip))
    conn.commit()

# Function to fetch all data from the database
def fetch_data(conn):
    cursor = conn.cursor()
    cursor.execute('SELECT date, temperature, precipitation FROM weather ORDER BY date ASC')
    return cursor.fetchall()

# Function to display weather data in a table format
def display_data(data):
    if not data:
        print("No data available to display.")
        return

    headers = ["Date", "Temperature (°C)", "Precipitation (mm)"]
    table = tabulate(data, headers=headers, tablefmt="grid")
    print("\nWeather Data Collected:\n")
    print(table)

# Function to generate a line chart visualization
def plot_line_chart(data):
    df = pd.DataFrame(data, columns=["Date", "Temperature (°C)", "Precipitation (mm)"])
    df["Date"] = pd.to_datetime(df["Date"])

    plt.figure(figsize=(10, 5))
    plt.plot(df["Date"], df["Temperature (°C)"], marker='o', linestyle='-', label="Temperature (°C)", color='red')
    plt.plot(df["Date"], df["Precipitation (mm)"], marker='o', linestyle='-', label="Precipitation (mm)", color='blue')

    plt.xlabel("Date")
    plt.ylabel("Values")
    plt.title("Temperature and Precipitation Changes Over Time")
    plt.xticks(rotation=45)
    plt.legend()
    plt.grid()
    plt.show()

# Function to generate a heatmap visualization
def plot_heatmap(data):
    df = pd.DataFrame(data, columns=["Date", "Temperature (°C)", "Precipitation (mm)"])
    df["Date"] = pd.to_datetime(df["Date"])
    df.set_index("Date", inplace=True)

    plt.figure(figsize=(10, 5))
    sns.heatmap(df.T, cmap="coolwarm", annot=True, linewidths=0.5)
    plt.title("Temperature and Precipitation Heatmap")
    plt.show()

# Function to run once per day at a set time
def daily_weather_task():
    conn = create_database()

    temp, precip = fetch_weather()
    date = time.strftime('%Y-%m-%d')
    insert_data(conn, date, temp, precip)

    print(f"\n Data collected for {date}: Temperature = {temp}°C, Precipitation = {precip}mm")

    # Fetch and display all data collected so far
    data = fetch_data(conn)
    display_data(data)
    
    # Generate visualizations
    plot_line_chart(data)
    plot_heatmap(data)

    conn.close()

# Automate the script to run every day at a set time
schedule.every().day.at("08:00").do(daily_weather_task)  # Runs at 8:00 AM daily

if __name__ == '__main__':
    print("\n Weather data collection for Dublin has started! The script will run at 08:00 AM daily.\n")
    
    # Ensure script has run at least four different days before exiting
    for _ in range(4):
        daily_weather_task()
        time.sleep(5)  # Simulate waiting for the next day (change to 86400 for real automation)

    # Keep running daily
    while True:
        schedule.run_pending()
        time.sleep(60)  # Check every minute
