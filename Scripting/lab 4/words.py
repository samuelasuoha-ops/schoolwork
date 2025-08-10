# student number: C00305107
# Date: 12/10/2024

# Question 1
# Function to take in a user's full name
def handleName(full_name):
    # This would print the length of the full name (including the spaces)
    print(f"Length of the name: {len(full_name)}")
    
    # This would split the full name into parts (first, middle, last) using spaces as the delimiter
    name_parts = full_name.split()
    
    # the first name
    print(f"First name: {name_parts[0]}")
    
    # This checks if the user has a middle name and prints it
    if len(name_parts) > 2:
        # this will put all the middle names into a single string
        middle_name = ' '.join(name_parts[1:-1])
        print(f"Middle name: {middle_name}")
    else:
        print("Middle name: N/A")
    
    # the last name
    print(f"Last name: {name_parts[-1]}")

# Question 2
# Function to check if a word is in a sentence
def containsWord(sentence, word):
    # This checks if the given word exists in the sentence. If the word is not found, it prints "Not Found"
    if word not in sentence:
        print('Not Found')
    else:
        # This counts how many times the word appears in sentence
        word_count = sentence.count(word)
        # This prints in the specified format using f-string
        print(f"The word {word} appears {word_count} times in '{sentence}'")

# Question 3
# Function to swap gender pronouns in a sentence
def swapGenderToFemale(sentence):
    # This stores the original sentence
    original_sentence = sentence
    
    # This would replace male pronouns with female pronouns
    sentence = sentence.replace(" he ", " she ")
    sentence = sentence.replace(" him ", " her ")
    sentence = sentence.replace(" his ", " her ")
    
    # This prints the original and the swapped sentences
    print(f"Original sentence: {original_sentence}")
    print(f"Swapped sentence: {sentence}")

# Example 
# Question 1
handleName("Jason Michael Doe")
handleName("Jason Doe")  # a case without the middle name
# Question 2
containsWord("I am writing a book. The book is really good.", "book")
# Question 3
swapGenderToFemale("He gave him his book. This is his responsibility.")
