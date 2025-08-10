package ex2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        String s;

        Scanner in = new Scanner(System.in);
        // string
        s = new String("");
        System.out.print("Enter a logical operator: ");
        s  = in.nextLine();
        System.out.println();

        if (s.equals("&&"))
            System.out.println("logical AND");
        else if (s.equals("||"))
            System.out.println("logical OR");
        else if (s.equals("!"))
            System.out.println("logical NOT");
        else
            System.out.println("Error, no match!");

    }
}
