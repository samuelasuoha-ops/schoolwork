# student number: C00305107
# Name: Sammuel Asuoha

# This function gets 10 numbers from the user and store them in a list
def get_numbers():
    numbers = []
    print("Enter 10 numbers:")
    for i in range(10):
        num = int(input(f"Number {i+1}: "))
        numbers.append(num)
    return numbers

# This function separates even and odd numbers
def separate_even_odd(numbers):
    evens = [num for num in numbers if num % 2 == 0]
    odds = [num for num in numbers if num % 2 != 0]
    return evens, odds

# This function sorts and print a list of fruits in alphabetical order
def sort_and_print_fruits(fruit):
    fruit.sort()
    print("Sorted list of fruits:", fruit)
    
# This function sorts and print a list of vegetables in alphabetical order
def sort_and_print_veg(veg):
    veg.sort()
    print("Sorted list of Vegetables:", veg)

# This function combines two lists (fruits and vegetables) and prints them in alphabetical order
def combine_and_sort(fruit, veg):
    combined = fruit + veg
    combined.sort()
    print("Combined list (fruits and vegetables) in alphabetical order:", combined)

# This function checks if a string is a fruit, vegetable, or neither
def check_fruit_or_veg(item, fruit, veg):
    if item.lower() in [f.lower() for f in fruit]:
        print(f"{item} is a fruit.")
    elif item.lower() in [v.lower() for v in veg]:
        print(f"{item} is a vegetable.")
    else:
        print(f"{item} is neither a fruit nor a vegetable.")

# This is the main function to call all the methods and test with values
def main():
    # This separates even and odd numbers
    numbers = get_numbers()
    evens, odds = separate_even_odd(numbers)
    print("Even numbers:", evens)
    print("Odd numbers:", odds)

    # This is the fruit list
    fruit = ['Apple', 'Orange', 'Banana', 'Grapes', 'Mango']
    sort_and_print_fruits(fruit)

    # This is the vegetable list 
    veg = ['Turnip', 'Cucumber', 'Carrot', 'Potato', 'Aubergine']
    sort_and_print_veg(veg)

    # This combines the fruit and vegetable lists
    combine_and_sort(fruit, veg)
    
    # This checks if a string is a fruit or vegetable
    item = input("Enter an item to check if it's a fruit or vegetable: ")
    check_fruit_or_veg(item, fruit, veg)

# This calls the main function
if __name__ == "__main__":
    main()

