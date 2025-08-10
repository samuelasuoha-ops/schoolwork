package ex4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        final double MILES_PER_KILOMETER = 1.60935;

        double miles;
        double kilometers;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of miles: ");
        miles = in.nextDouble();
        kilometers = MILES_PER_KILOMETER * miles;

        System.out.printf("That distance in kilometers is %.2f " ,kilometers);

    }
}
