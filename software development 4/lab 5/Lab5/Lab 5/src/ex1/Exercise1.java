package ex1;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    // write your code here
        final double HOURLY_RATE = 7.25;
        final double REGULAR_HOURS= 40;
        final double OVERTIME_RATE = 0.5;
        final double LOW_COMMISSION_RATE = 0.05;

        int hrsWorked;
        double totalSales;
        double wage;
        double basePay;
        double overTimePay=0;
        double commission=0.0;

        System.out.println("Enter hours worked");
        hrsWorked =in.nextInt();
        System.out.println("Enter total sales");
        totalSales = in.nextDouble();

        basePay = hrsWorked*HOURLY_RATE;
        if(hrsWorked>REGULAR_HOURS){
            overTimePay = (hrsWorked-REGULAR_HOURS)*(HOURLY_RATE*OVERTIME_RATE);
        }
        if(totalSales>50){
            commission=totalSales*LOW_COMMISSION_RATE;
        }

        wage=basePay+overTimePay+commission;

        System.out.println("Number of Hours Worked "+hrsWorked);
        System.out.printf("Total Sales €%.2f%n",totalSales);
        System.out.printf("Wage €%.2f",wage);

    }
}
