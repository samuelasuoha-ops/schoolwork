package ex1;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);

        final double RATES = 0.20;
        final double RATEM = 0.23;
        final double ALLOW_1 = 25000;
        final double ALLOW_2 = 20000;

        double grossPay;
        double netPay, totalTax = 0, allowance = 0;

        String empId, name, address, password1, password2;
        String strIn;  //string to read in character
        char status;


        //input data
        System.out.println("\t\tWelcome to the Payroll Program");
        System.out.print("Please enter your employee id: ");
        empId = in.nextLine();
        System.out.print("Please enter your name: ");
        name = in.nextLine();
        System.out.print("Please enter your address: ");
        address = in.nextLine();
        System.out.print("Please enter your marital status - s for single , m for married: ");
        strIn = in.nextLine();
        status = strIn.charAt(0);//extract and store as a character

        System.out.print("Please enter your gross pay: ");
        grossPay = in.nextDouble();

        in.nextLine();  //dummy read to discard line feed

        //calculate pay by first determining appropriate allowance
        if (grossPay < 50000) {
            allowance = ALLOW_1;
        } else if (grossPay >= 50000) {
            allowance = ALLOW_2;
        }

        //calculate totaltax
        if (status == 's') {
            totalTax = (grossPay - allowance) * RATES;
        } else if (status == 'm') {
            totalTax = (grossPay - allowance) * RATEM;
        }
        //calculate netpay
        netPay = grossPay - totalTax;


        //output results
        System.out.printf("%n\t\tPayroll Details for Employee %s%n", empId);
        System.out.printf("Id            \t\t:%s%n", empId);
        System.out.printf("Name          \t\t:%s%n", name);
        System.out.printf("Address       \t\t:%s%n", address);
        System.out.printf("Marital status\t\t:%s%n", status);
        System.out.printf("For a gross pay of €%.2f, your total tax is €%,.2f and"
                + " your netpay is €%,.2f%n", grossPay, totalTax, netPay);


        System.out.println("\n\n\t\tSecurity Feature");
        System.out.print("Please enter your password: ");
        password1 = in.nextLine();
        System.out.print("Please re-enter your password: ");
        password2 = in.nextLine();
        if (!password1.equals(password2))    //test if both entries are equal
        {
            System.out.println("Incorrect - passwords not the same");
        }
    }
}
