package ex7;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int CONVERSION = 60;

        System.out.println("Please enter the number of seconds");
        int secs = in.nextInt();

        int hours = secs/(CONVERSION*CONVERSION);
        int rem1 = secs%(CONVERSION*CONVERSION);

        int minutes = rem1/CONVERSION;

        int seconds = rem1%CONVERSION;

        System.out.println("Number of hours: " +hours);
        System.out.println("Number of minutes: " +minutes);
        System.out.println("Number of seconds: " +seconds);

    }
}
