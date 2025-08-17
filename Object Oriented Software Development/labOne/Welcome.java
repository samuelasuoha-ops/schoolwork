//student id: C00305107
//date: 22/09/2024
package labOne;

public class Welcome {
	public static void main(String[] args) {
		// Declared two integer variables, num1 and num2, and assigned them values
	    int num1 = 10;
	    int num2 = 20;
	    // Prints "Welcome" and "I'm Samuel" on different lines by using 2System.out.println"
	    System.out.println("Welcome");// Output is: Welcome
	    System.out.println("I'm Samuel");// Output is: I'm Samuel
	    // prints the value of num1, which is 10, along with the text "Number one:"
		System.out.println("Number one: " + num1);// Output is: Number one: 10
		// prints the value of num2, which is 20, along with the text "Number two:"
	    System.out.println("Number two: " + num2);// Output is: Number two: 20
	    // Prints the sum of num1 and num2. The addition happens inside the parentheses, ensuring the correct result is calculated
		System.out.println("The sum is " + (num1 + num2));// Output is: The sum is 30
		// Prints the product of num1 and num2
		System.out.println("The product is " + (num1 * num2));// Output is: The product is 200
		// Prints the difference between num1 and num2
		System.out.println("The difference is " + (num1 - num2));// Output is: The difference is -10
	 }
}

//Error: first result appeared as listed below
// WelcomeI'm SamuelNumber one: 10
//Number two: 20
//The sum is 30
//The product is 200
//The difference is -10

//I got my current result by replacing System.out.print() with System.out.println()