package ex4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String surname;
        System.out.println("Please enter your surname");
        surname = in.nextLine();

        if(surname.equals("Magee")){
            System.out.println("Surname entered correctly");
        }
    }
}
