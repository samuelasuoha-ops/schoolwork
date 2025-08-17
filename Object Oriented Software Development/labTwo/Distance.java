//student id: C00305107
//date: 06/10/2024
package labTwo;
import java.util.Scanner;
public class Distance {
	public static void main(String[] args) {
        // This reads input from users
		Scanner scanner = new Scanner(System.in);
		// These allow users to input into consoles
        System.out.print("Input distance in miles: ");
        double miles = scanner.nextDouble();

        System.out.print("Input time travelled in hours: ");
        double time = scanner.nextDouble();

        System.out.print("Input petrol in gallons: ");
        double gallons = scanner.nextDouble();

        // This would calculate the average miles per hour and miles per gallon
        double avgMilesPerHour = miles / time;
        double avgMilesPerGallon = miles / gallons;

        // This displays the result
        System.out.printf("Average miles per hour: %.2f%n", avgMilesPerHour);
        System.out.printf("Average miles per gallon: %.2f%n", avgMilesPerGallon);

        // This closes the scanner
        scanner.close();
    }
}
