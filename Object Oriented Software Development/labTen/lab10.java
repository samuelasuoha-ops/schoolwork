// Student ID: C00305107
// Date: 08/03/2025
package labTen;
import java.util.*;
public class lab10 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    task1(scanner);
	    task2(scanner);
	    task3(scanner);
	    scanner.close();
	}

    // Task 1
	 public static void task1(Scanner scanner) {
	 	// Set to store incorrect guesses
        Set<Integer> guesses = new HashSet<>();
        // This generates a random target number between 0 and 20
        int target = new Random().nextInt(21);
        int guess;
        
        System.out.println("Guess a number between 0 and 20:");
        // This loops until the user guesses the correct number
        do {
            guess = scanner.nextInt(); // Gets the user's guess
            if (guess == target) {
                System.out.println("Matched!"); 
            } else {
                guesses.add(guess); // Adds incorrect guess to the set
                System.out.println("Incorrect. Previous guesses: " + guesses);
            }
        } while (guess != target); // This repeats until the correct guess is made
    }


    // Task 2
	 public static void task2(Scanner scanner) {
        // List to store Recipe objects
        List<Recipe> recipes = new ArrayList<>();
        String name; 
        boolean dairy, meat, gluten; 

        System.out.println("Enter recipe details. Type 'Q' as name to stop.");
        
        // This is the loop to collect recipe details from the user
        while (true) {
            System.out.print("Enter recipe name: ");
            name = scanner.next(); // Reads recipe name

            // This breaks the loop if the user enters 'Q' to quit
            if (name.equalsIgnoreCase("Q")) break;

            // This prompts for dietary information (dairy, meat, gluten)
            System.out.print("Contains dairy? (true/false): ");
            dairy = scanner.nextBoolean();
            System.out.print("Contains meat? (true/false): ");
            meat = scanner.nextBoolean();
            System.out.print("Contains gluten? (true/false): ");
            gluten = scanner.nextBoolean();

            scanner.nextLine(); 

            // Adds the new Recipe object to the list
            recipes.add(new Recipe(name, dairy, meat, gluten));
        }
        
        // This displays all stored recipes
        System.out.println("Recipes stored:");
        for (Recipe recipe : recipes) {
            System.out.println("- " + recipe.getName() + " (Dairy: " + recipe.hasDairy() + ", Meat: " + recipe.hasMeat() + ", Gluten: " + recipe.hasGluten() + ")");
        }
    }

    // Task 3
	 public static void task3(Scanner scanner) {
        // Create a HashMap to store students with their IDs as keys
        Map<String, Student> students = new HashMap<>();
        
        // Sample student data of the HashMap
        students.put("2001465", new Student("John Doe", "2001465", "Computer Science"));
        students.put("2001466", new Student("Jane Smith", "2001466", "Mathematics"));
        students.put("2001467", new Student("Alice Brown", "2001467", "Physics"));

        // This displays the available student IDs
        System.out.println("Student IDs: " + students.keySet());

        // This prompts the user to enter a student ID
        System.out.print("Enter a student ID: ");
        String id = scanner.next(); // This reads the student ID input

        // This retrieves the Student object from the HashMap
        Student student = students.get(id);
        
        // This is to check if the student ID exists in the map
        if (student != null) {
            // If found, display the student's name and module
            System.out.println("Student Name: " + student.getName() + ", Module: " + student.getModule());
        } else {
            // If not found, notify the user
            System.out.println("Student not found");
        }
    }
}


