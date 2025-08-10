package ex3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        radius = in.nextDouble();

        if (radius <= 0)
            System.out.println("Error - negative radius!");
        else {
            area = Math.PI * (radius * radius);
            System.out.printf("The area is: %.2f", area);
        }
    }
}
