package ex4a;

import java.util.Scanner;

public class Exercise4a {
    public static void main(String[] args) {
        int coinage;
        double euros;
        final double RATE = 1.27;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the coinage amount: ");
        coinage = in.nextInt();
        System.out.println();

        switch (coinage) {
            case 1:
            case 2:
            case 5:
            case 10:
            case 20:
            case 50: {
                euros = (coinage * RATE);           // convert to cents
                System.out.println(coinage + "p" + " = " + euros + " cents");
                break;
            }
            default: {
                System.out.println("Invalid coinage amount!");
                break;
            }

        }

    }
}
