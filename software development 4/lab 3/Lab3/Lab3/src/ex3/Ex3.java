package ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float number1;
        float number2;

        System.out.println("Enter number 1: ");
        number1 = in.nextFloat();
        System.out.println("Enter number 2: ");
        number2 = in.nextFloat();

        System.out.printf("The sum of the 2 numbers is: %.2f%n",(number1+number2));
        System.out.printf("The difference between the 2 numbers is: %.2f%n",(number1-number2));
        System.out.printf("The product of the 2 numbers is: %.2f%n",(number1*number2));
    }
}
