# Student number:C00305107
# Name: Samuel Asuoha

# Defined function to add two numbers and print the result
def add(a, b):
    result = a + b
    print(f"The sum of {a} and {b} is: {result}")

# Addition function test
if __name__ == "__main__":
    # add function called
    add(2,4)# adding 2 and 4
    add(7,9)# adding 7 and 9

# Defined function to divide two numbers with error handling for division by zero
def divide(a, b):
    #result = a / b
    #print(f"Division result of {a} and {b} is: {result}")
    
    # this ensures that if the second value is 0, the result will return 0. Else it continues with calculation.
    if b == 0:
        return b
    else:
        return 0
    
    result = a / b
    print(f"Division result of {a} and {b} is: {result}")
    
# Division fuinction test
if __name__ == "__main__":
    divide(50, 10) # This will show 5.0
    #divide(5, 0) # This will show error (ZeroDivisionError: division by zero) as seen below in error log.
    
# Defined function to subtract two numbers entered by the user
def subtract():
    a = float(input("Enter the first number: "))# allows user to enter desired number
    b = float(input("Enter the second number: "))
    result = a - b # subtracts inputed values
    print(f"The result of {a} - {b} is: {result}")# This will show the result of subtraction

# subtraction function test
if __name__ == "__main__":
    subtract()



#Error log
#divide(5, 0): This will show error (ZeroDivisionError: division by zero).
    # After adding an If-else, this should have returned 0 but i keep getting same error 
    #or the program ignores my code when it has been rearranged as seen above. Unable to fix
