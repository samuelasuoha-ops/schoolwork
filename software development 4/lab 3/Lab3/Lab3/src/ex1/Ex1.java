package ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        final int BASE = 32;
        final double CONVERSION_FACTOR = 5 / 9;

        double celciusTemp, fahTemp;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature in degrees fahrenheit");
        fahTemp = in.nextDouble();
        celciusTemp = CONVERSION_FACTOR * (fahTemp - BASE);

        System.out.println("Fahrenheit Temperature: " + fahTemp);
        System.out.printf("Celcius Equivalent: %.2f", celciusTemp);

    }
}