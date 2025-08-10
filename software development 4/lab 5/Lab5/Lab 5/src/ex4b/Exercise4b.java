package ex4b;

import java.util.Scanner;

public class Exercise4b {
    public static void main(String[] args) {
        int coinage;
        double euros;
        final double RATE = 1.27;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the coinage amount: ");
        coinage = in.nextInt();

        switch(coinage){
            case 1,2,5,10,20,50 -> {
                euros = (coinage * RATE);           // convert to cents
                System.out.println(coinage + "p" + " = " + euros + " cents");
            }
            default -> System.out.println("Invalid coinage amount!");
        };
    }
}
