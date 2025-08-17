//student id: C00305107
//date: 06/10/2024
package labTwo;
import java.util.Scanner;
public class Loan {
	public static void main(String[] args) {
		// This reads input from users
		Scanner scanner = new Scanner(System.in);
		
		// These allow users to input data into consoles
        System.out.print("Input loan amount: ");
        double loanamount = scanner.nextDouble();

        System.out.print("Input interest rate (in percentage): ");
        double interestrate = scanner.nextDouble();

        System.out.print("Input number of years: ");
        int years = scanner.nextInt();

        // This is simple interest calculation
        double totalrepayment = loanamount + (loanamount * interestrate * years / 100);

        // This displays the total re-payment
        System.out.printf("Total amount to be re-paid: %.2f%n", totalrepayment);

        // This closes the scanner
        scanner.close();
    }
}
