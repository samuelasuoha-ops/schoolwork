package ex6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MONTHS_IN_YEAR = 12;
        double loanAmount;
        double annualInterestRate;
        int loadPeriod;
        double monthlyPayment;
        double totalPayment;
        int numPayments;
        double monthlyInterestRate;


        System.out.println("Enter the loan amount");
        loanAmount = in.nextDouble();
        System.out.println("Enter the annual interest rate");
        annualInterestRate = in.nextDouble();
        System.out.println("Enter the loan period in years");
        loadPeriod = in.nextInt();


        monthlyInterestRate = annualInterestRate/100/MONTHS_IN_YEAR;
        numPayments = loadPeriod*MONTHS_IN_YEAR;

        monthlyPayment = (loanAmount*monthlyInterestRate)/(1-Math.pow(1+monthlyInterestRate,-numPayments));
        totalPayment = monthlyPayment*numPayments;
        System.out.printf("Loan Amount: €%,.2f%n",loanAmount);
        System.out.println("Annual Interest Rate: "+annualInterestRate);
        System.out.println("Loan Period in Years: "+loadPeriod);
        System.out.printf("Monthly Payment: €%.2f%n",monthlyPayment);
        System.out.printf("Total Payment: €%,.2f",totalPayment);

    }
}
