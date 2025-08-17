package labFour;
import java.util.Scanner;

public class string {
	 // Class to handle name manipulations
    static class Name {
        String fullName;
        
        // Constructor
        public Name(String name) {
            this.fullName = name;
        }
        
        // This would extract and return the surname
        public String getLastName() {
            return fullName.substring(fullName.lastIndexOf(" ") + 1);
        }
        
        // This would extract and return the first name
        public String getFirstName() {
            return fullName.substring(0, fullName.indexOf(" "));
        }
        
        // This returns the length of the full name (excluding spaces)
        public int getNameLength() {
            return fullName.replace(" ", "").length();
        }
        
        // This counts the number of upper case letters in the name
        public int getUpperCaseCount() {
            int count = 0;
            for (char c : fullName.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    count++;
                }
            }
            return count;
        }
        
        // This would reverse the full name
        public String getReversedName() {
            StringBuilder reversed = new StringBuilder(fullName);
            return reversed.reverse().toString();
        }
        
        // This counts how many times 'a' appears in the name
        public int countLetterA() {
            int count = 0;
            for (char c : fullName.toLowerCase().toCharArray()) {
                if (c == 'a') {
                    count++;
                }
            }
            return count;
        }
        
        // This counts the number of vowels in the name
        public int countVowels() {
            int count = 0;
            String vowels = "aeiouAEIOU";
            for (char c : fullName.toCharArray()) {
                if (vowels.indexOf(c) != -1) {
                    count++;
                }
            }
            return count;
        }
    }
    
    static class Palindrome {
        
        // This checks if a word is a palindrome
        public static boolean isPalindrome(String word) {
            String cleanedWord = word.toLowerCase();
            String reversedWord = new StringBuilder(cleanedWord).reverse().toString();
            return cleanedWord.equals(reversedWord);
        }
    }
    
    // This handles input and output
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menu for selecting task
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Name Manipulation (Task 1)");
            System.out.println("2. Palindrome Check (Task 2)");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer
        
            switch (choice) {
            case 1:
                // Task 1: Name manipulation
            	System.out.println("Enter name:");
                String name = scanner.nextLine();
                
                Name userName = new Name(name);
                
                System.out.println("Last name: " + userName.getLastName());
                System.out.println("First name: " + userName.getFirstName());
                System.out.println("Name length: " + userName.getNameLength());
                System.out.println("Number of Uppercase letters: " + userName.getUpperCaseCount());
                System.out.println("Reversed: " + userName.getReversedName());
                System.out.println("Number of times 'a' appears: " + userName.countLetterA());
                System.out.println("Number of vowels: " + userName.countVowels());
                break;
            case 2:
                // Task 2: Palindrome check
                System.out.println("Enter word:");
                String word = scanner.nextLine();

                if (Palindrome.isPalindrome(word)) {
                    System.out.println(word + " is a palindrome");
                } else {
                    System.out.println(word + " is not a palindrome");
                }
                break;

            case 3:
                // Exit the program
                System.out.println("Exiting program...");
                // This closes the scanner
                scanner.close();
                return;

            default:
                System.out.println("Invalid choice, please try again.");
            }
            
            // This closes the scanner
            //scanner.close();
        }  
    }    
}


//Error log:
//In the main method to handle the input and output of the program, I encounter a warning on 
//line 82. The warning states- resource leak: 'scanner' is never closed. To fix this, I closed the scanner.

//I received the following error: java.lang.IllegalStateException: Scanner closed
										//at java.base/java.util.Scanner.ensureOpen(Scanner.java:1175)
										//at java.base/java.util.Scanner.next(Scanner.java:1598)
										//at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
										//at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
										//at labFour.string.main(string.java:90)
//This happened because i closed the scanner prematurely as seen in line 132. 
