#Student num: c00305107
#name: Samuel Asuoha

# Function to check if a number is odd or even
def oddOrEven(number):
    # This returns true if the number is even and false if it's odd
    return number % 2 == 0 # % operator checks the remainder when dividing by 2 and if remainer is 0 then it is even and if it isn't then its odd

# Test of function
#if __name__ == "__main__":
 #   print(f"Is 4 even? {oddOrEven(4)}")
  #  print(f"Is 7 even? {oddOrEven(7)}")


# Function to return the highest number from a list of values
def maxDigit(*values):
    max_digit = 0  # Started with the smallest possible value
    for value in values:
        for digit in str(value):  # Converts each value to string and iterates over the numbers
            max_digit = max(max_digit, int(digit))  # Compares the numbers and stores the maximum
    return max_digit

# Test of function
#if __name__ == "__main__":
 #   print(f"Max digit between 9, 7 and 6 is: {maxDigit(9,7,6)}") 
  #  print(f"Max digit between 8 and 5 is: {maxDigit(8,5)}")


# Function to loop until the user enters the correct code
def findTheSyntaxErrors():
    # These can be adjusted as desired
    correct_code = "system.out.println('Hello World')"  # Correct version of the broken code
    error_message = "system.out.printLn('Hello World')"  # Simulated broken code
    print(f"Find the syntax error in the following code:\n{error_message}")
    
    # This continues to prompt the user until they input the correct version
    while True:
        user_input = input("Enter fixed code: ")
        if user_input == correct_code:
            print("Correct! Syntax error fixed.")
            break # this would exit the loop if the correct code is entered
        else:
            print("Incorrect code. Try again.")

# Test of function
#if __name__ == "__main__":
 #   findTheSyntaxErrors()

# Test of all functions
if __name__ == "__main__":
    # Test for oddOrEven function
    print(f"Is 4 even? {oddOrEven(4)}")# This will return True
    print(f"Is 7 even? {oddOrEven(7)}")# This will return False
    
    # Test for maxDigit function
    print(f"Max digit between 9, 7 and 6 is: {maxDigit(9, 7, 6)}")# This will return 9
    print(f"Max digit between 8 and 5 is: {maxDigit(8, 5)}")# This will return 8

    # Test for findTheSyntaxErrors function
    findTheSyntaxErrors() # This will run until user inputs the correct code

    


#errorlog:
    #1. Error from max function: RecursionError. I get this error because there is a clash between my "max" function and pythons built in "max()" function. Error fixed by renaming my function.
    # def max(*values) changed to def maxDigit(*values)
