package ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        final double SPEED = 2;

        double yard_width;
        double yard_length;
        double house_width;
        double house_length;
        double house_area;
        double yard_area;
        double grass_size;
        double time;


        Scanner in = new Scanner(System.in);

        System.out.println("Enter the yard width: ");
        yard_width = in.nextDouble();
        System.out.println("Enter the yard length: ");
        yard_length = in.nextDouble();
        System.out.println("Enter the house width: ");
        house_width = in.nextDouble();
        System.out.println("Enter the house length: ");
        house_length = in.nextDouble();


        house_area = house_width * house_length;
        yard_area = yard_length * yard_width;

        grass_size = yard_area - house_area;

        time = ((grass_size / SPEED)/60);


        // Display the length of time in mins
        System.out.printf("The length of time to cut the grass is %.2f minutes %n", time);

    }
}
