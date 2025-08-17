//student ID: C00305107
//Date: 20/10/24
package labFive;
import java.util.Scanner;

public class Methods {

    // This is th main method to test the various methods defined below
    public static void main(String[] args) {
        // Test for isEven method
        System.out.println("21 is even: " + isEven(21));
        System.out.println("12 is even: " + isEven(12));

        // Test for isAlpha method
        System.out.println("'A' is alphabetic: " + isAlpha('A'));
        System.out.println("'%' is alphabetic: " + isAlpha('%'));

        // Test for award method
        System.out.println("97 is a: " + award(97));
        System.out.println("42 is a: " + award(42));

        unitConverterMenu();
    }

    // This method takes an integer as input and returns true if it's even and false if it's odd
    public static boolean isEven(int num) {
        return num % 2 == 0; 
    }

    // This method takes a character and returns true if it's an alphabetic letter 
    public static boolean isAlpha(char ch) {
        return Character.isAlphabetic(ch); 
    }

    // This method takes an exam score as input and returns a string based on the grade
    public static String award(int score) {
        if (score >= 70 && score <= 100) {
            return "Distinction";
        } else if (score >= 63 && score <= 69) {
            return "Merit1";
        } else if (score >= 55 && score <= 62) {
            return "Merit2";
        } else if (score >= 40 && score <= 54) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    // This method displays a menu to the user and allows multiple conversions
    public static void unitConverterMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Menu loop: repeat until user chooses to exit
        do {
            // This displays menu options to the user
            System.out.println("Please enter your choice:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Inches to Centimeters");
            System.out.println("4. Centimeters to Inches");
            System.out.println("5. Pounds to Kilograms");
            System.out.println("6. Kilograms to Pounds");
            System.out.println("7. Exit");

            // This gets the user's choice
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Fahrenheit to Celsius calculation
                    System.out.println("Insert the temperature in Fahrenheit degrees:");
                    double fahrenheit = scanner.nextDouble();
                    System.out.println("The temperature in Celsius is: " + fahrToCel(fahrenheit));
                    break;
                case 2:
                    // Celsius to Fahrenheit calculation
                    System.out.println("Insert the temperature in Celsius degrees:");
                    double celsius = scanner.nextDouble();
                    System.out.println("The temperature in Fahrenheit is: " + celToFahr(celsius));
                    break;
                case 3:
                    // Inches to Centimeters calculation
                    System.out.println("Insert the length in Inches:");
                    double inches = scanner.nextDouble();
                    System.out.println("The length in Centimeters is: " + inchToCent(inches));
                    break;
                case 4:
                    // Centimeters to Inches calculation
                    System.out.println("Insert the length in Centimeters:");
                    double centimeters = scanner.nextDouble();
                    System.out.println("The length in Inches is: " + centToInch(centimeters));
                    break;
                case 5:
                    // Pounds to Kilograms calculation
                    System.out.println("Insert the weight in Pounds:");
                    double pounds = scanner.nextDouble();
                    System.out.println("The weight in Kilograms is: " + poundsToKg(pounds));
                    break;
                case 6:
                    // Kilograms to Pounds calculation
                    System.out.println("Insert the weight in Kilograms:");
                    double kilograms = scanner.nextDouble();
                    System.out.println("The weight in Pounds is: " + kgToPounds(kilograms));
                    break;
                case 7:
                    // Exit option
                    System.out.println("Bye!");
                    break;
                default:
                    // Invalid input handling if user inputs unavailable choice
                    System.out.println("Invalid choice. Please try again.");
            }

        } 
        // Loops code until user selects exit option
        while (choice != 7);
        // This closes the scanner 
        scanner.close();
    }

    // Converts Fahrenheit to Celsius
    public static double fahrToCel(double fahr) {
        return (fahr - 32) * 5 / 9; 
    }

    // Converts Celsius to Fahrenheit
    public static double celToFahr(double cel) {
        return (cel * 9 / 5) + 32; 
    }

    // Converts Inches to Centimeters
    public static double inchToCent(double inch) {
        return inch * 2.54; 
    }

    // Converts Centimeters to Inches
    public static double centToInch(double cent) {
        return cent / 2.54; 
    }

    // Converts Pounds to Kilograms
    public static double poundsToKg(double pounds) {
        return pounds * 0.453592; 
    }

    // Converts Kilograms to Pounds
    public static double kgToPounds(double kg) {
        return kg / 0.453592; 
    }
}

