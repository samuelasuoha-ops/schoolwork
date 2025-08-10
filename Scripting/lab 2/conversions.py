# student num: C00305107
# Name: Samuel Asuoha

# Function to convert pounds to kilograms
def poundToKilogram(pounds):
    return pounds * 0.45359237 # formula to turn pounds to kilograms

# Test of function
#if __name__ == "__main__":
 #   print(f"3 pounds is {poundToKilogram(3):.3f} kilograms.")# prints result and rounds up decimal to 3 decimal places

# Function to print time in 12-hour format
def printTime(time, timezone=0): # the timezone parameter set to 0 as default value
    # Adjusts time based on timezone
    timezone += time

    # Extracts hours and minutes
    hours = int(time)# this gets the hours
    minutes = (time - hours) * 100 # this converts decimal part to minutes

    # Determines AM or PM and convert to 12-hour format
    if hours >= 12:
        if hours > 12:
            hours -= 12 # converts hours to 12-hour format if greater than 12
        period = "pm" # sets the period to pm
    else:
        if hours == 0:
            hours = 12# sets to "12" for "12am" instead of "0am"
        period = "am"# set the period to am
    
    print(f"{hours}:{minutes:02.0f}{period}")

# Test of function
#if __name__ == "__main__":
 #   printTime(12.36)# prints 12:36pm
  #  printTime(16.004)# prints 4:00pm
   # printTime(13.15, -3)# prints 10:15am

# Function to calculate kilometers per hour 
def distanceInKilometers(miles, hours):
    # Converts miles to kilometers
    kilometers = float(miles) * 1.609344
    # Calculates kilometers per hour
    kilometersPerHour = kilometers / float(hours)
    # Prints the result and rounds to 1 decimal place
    print(f"{round(kilometersPerHour, 1)} kph")

# Test of function with keyword arguments
#if __name__ == "__main__":
 #   distanceInKilometers(miles="12.5", hours="3")# prints 6.7 kph
  #  distanceInKilometers(hours="4.5", miles="23")# prints 8.2 kph

# Function to convert inches to centimeters with a variable number 
def inchToCentimetre(*inches):
    # Converts each inch value to centimeters
    for inch in inches:
        print(f"{inch} inches is {inch * 2.54:.2f} cm")

# Test of function
#if __name__ == "__main__":
 #   inchToCentimetre(2, 4, 52)# converts and prints each value
  #  inchToCentimetre(1, 23.5, 9.75)# converts and prints each value

# Lambda function to convert stones to pounds
convertWeight = lambda stones: stones * 14

# Test the lambda function
#if __name__ == "__main__":
 #   print(f"3 stones is {convertWeight(3)} pounds.")  # prints 42 pounds

#Main test of all functions
if __name__ == "__main__":
    # Test of poundToKilogram function
    print(f"3 pounds is {poundToKilogram(3):.3f} kilograms.")
    
    # Test of printTime function
    printTime(12.36)# prints 12:36pm
    printTime(16.004)# prints 4:00pm
    printTime(13.15, -3)# prints 10:15am
    
    # Test of distanceInKilometers funtion
    distanceInKilometers(miles="12.5", hours="3")# prints 6.7 kph
    distanceInKilometers(hours="4.5", miles="23")# prints 8.2 kph
    
    # Test of inchToCentimetre function
    inchToCentimetre(2, 4, 52)# converts and prints each value
    inchToCentimetre(1, 23.5, 9.75)# converts and prints each value
    
    # Test of lambda function 
    print(f"3 stones is {convertWeight(3)} pounds.")# prints 42 pounds



