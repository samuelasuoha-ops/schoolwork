Weather Data Collection & Automation
====================================
Name: Samuel Asuoha
Student ID: C00305107

This script fetches daily weather data from WeatherAPI for Dublin. It extracts:
- Temperature (in Celsius)
- Precipitation (in millimeters)

The data is:
- Stored in an SQLite database (`weather_data.db`).
- Displayed in the console in a formatted table using the `tabulate` library.
- Automatically fetched once per day at 08:00 AM using the `schedule` module.
- Visualized using:
  - Line Chart: Shows temperature and precipitation changes over time.
  - Heatmap: Highlights temperature fluctuations visually.

---

Automation:
-----------
- The script runs automatically every day at 08:00 AM.
- A new entry is added to the database each day.
- The script continues running indefinitely after collecting data for four days.

---

Setup:
------
1. Install required dependencies  
   Run the following command to install all necessary Python packages:  

2. Get a WeatherAPI Key  
- Sign up for a free account at: [https://www.weatherapi.com/](https://www.weatherapi.com/)  
- Copy your API key and replace `"YOUR_API_KEY"` in the script.

3. Run the script  
The script will collect weather data daily at 08:00 AM and store it in the database.

4. Leave the script running  
- The script runs every day at 08:00 AM.
- It will automatically update the SQLite database and display the collected data in a table.
- It will generate visualizations to help track weather changes.

---

Weather Data Collected(example):

+------------+------------------+--------------------+
| Date       | Temperature (°C) | Precipitation (mm) |
+------------+------------------+--------------------+
| 2025-03-08 | 12.5             | 1.2                |
| 2025-03-09 | 14.2             | 0.0                |
| 2025-03-10 | 11.8             | 5.3                |
| 2025-03-11 | 10.1             | 2.7                |
+------------+------------------+--------------------+
