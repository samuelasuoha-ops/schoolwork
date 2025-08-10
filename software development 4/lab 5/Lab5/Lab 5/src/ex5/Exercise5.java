package ex5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        final int NORMAL_RATE_PER_HOUR = 10;
        final int NORMAL_HOURS_PER_DAY = 8;

        int startTime;
        int finishTime;
        int hoursWorked;
        double earned;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the start time: ");
        startTime  = in.nextInt();
        System.out.println();

        System.out.print("Enter the finish time: ");
        finishTime  = in.nextInt();
        System.out.println();

        hoursWorked = ( (finishTime - startTime) / 100 ) - 1; // take off break

        if (hoursWorked < 0)
            System.out.println("Invalid time entry!");
        else
        {

            if (hoursWorked > NORMAL_HOURS_PER_DAY)                  // overtime
            {
                earned =  ( (NORMAL_HOURS_PER_DAY * NORMAL_RATE_PER_HOUR) + ( (hoursWorked - NORMAL_HOURS_PER_DAY) * (NORMAL_RATE_PER_HOUR * 1.5) ) );
            }
            else                                                  // no overtime
                earned = (hoursWorked * NORMAL_RATE_PER_HOUR);

            System.out.println("You earned €" + earned + " today");
        }

    }
}
