package ex6;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int CONVERSION = 60;
        System.out.println("Please enter the number of hours");
        int hours = in.nextInt();
        System.out.println("Please enter the number of minutes");
        int mins = in.nextInt();
        System.out.println("Please enter the number of seconds");
        int secs = in.nextInt();

        int totalSeconds = (secs + (mins*CONVERSION) + (hours*CONVERSION*CONVERSION));
        System.out.println("The total amount of seconds is: "+totalSeconds);
    }
}
