package ex4;

import java.util.Scanner;

public class TestEx4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char quit;
        double degrees, convertedDegrees;
        char units;

        System.out.println("\t\t Temperature Conversion Programs");
        System.out.println("Enter 'Q' to quit menu or any other character to perform a temperature conversion");
        quit = in.next().charAt(0);

        while(quit != 'Q' && quit != 'q'){
            System.out.println("Enter a temperature in degrees");
            degrees = in.nextDouble();
            System.out.println();

            System.out.println("Enter 'F' or 'f' for Fahrenheit or 'C' or 'c' for Celcius");
            units = in.next().charAt(0);

            switch(units){
                case 'F','f'-> {
                    convertedDegrees = 5 * (degrees - 32) / 9;
                    System.out.printf("%.2f degress F = %.2f degrees C", degrees, convertedDegrees);
                }
                case 'C','c' -> {
                    convertedDegrees = degrees * 9 / 5 + 32;
                    System.out.printf("%.2f degress C = %.2f degrees F", degrees, convertedDegrees);
                }
                default ->
                    System.out.println("Unknown units, must be C for Celcius or F for Fahrenheit");

            }

            System.out.println();
            System.out.println("Enter 'Q' to quit menu or any other character to perform a temperature conversion");
            quit = in.next().charAt(0);
        }
        System.out.println("Conversion Complete");
    }
}
