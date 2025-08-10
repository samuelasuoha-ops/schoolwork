package ex8;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        String emailAddress;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a valid email address");
        emailAddress = in.nextLine();

        int index = emailAddress.indexOf('@');
        if (index <0){
            System.out.println("Invalid email address");
        }else{
            System.out.println("Email address validated: "+emailAddress);
        }
    }
}
