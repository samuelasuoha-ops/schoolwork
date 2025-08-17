//student id: C00305107
//date: 06/10/2024
package labTwo;
import java.util.Scanner;
public class Converter {
	public static void main(String[] args) {
		// This reads input from users
		Scanner scanner = new Scanner(System.in);
		// This allows users to input into consoles
        System.out.print("Input Inches: ");
        double inches = scanner.nextDouble();

        // This converts inches to centimetres
        double centimetres = inches * 2.54;
        
        // This displays the result
        System.out.println(centimetres + " centimetres");

        // This closes the scanner
        scanner.close();
    }
}
