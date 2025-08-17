//student id: C00305107
//date: 06/10/2024
package labTwo;
import java.util.Scanner;
public class Calculator {
	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double product = 1;
        
        // This allows user to input three numbers and compute the sum and product
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = scanner.nextDouble();
            // This adds inputed numbers for sum and multiplies for product
            sum += num;
            product *= num;
        }
        // This calculates average after all numbers are entered
        double average = sum / 3;

        // This displays the result
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Product: %.2f%n", product);
        System.out.printf("Average: %.2f%n", average);

        // This closes the scanner
        scanner.close();
    }
}
	 //Previous code
	// public static void main(String[] args) {
	  //      Scanner scanner = new Scanner(System.in);
	    //    double sum = 0;
	      //  double product = 1;
	        //double average;

	        //for (int i = 1; i <= 3; i++) {
	          //  System.out.print("Enter number " + i + ": ");
	            //double num = scanner.nextDouble();
	            
	           // sum += num;
	           // product *= num;
	           // average = sum / i;

	            // This displays results
	   //         System.out.printf("Current sum: %.2f%n", sum);
	   //         System.out.printf("Current product: %.2f%n", product);
	   //         System.out.printf("Current average: %.2f%n", average);
	  //      }

	  //      // This closes the scanner
	  //      scanner.close();
	  //  }

