package ex6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1;
        String word2;
        String word3;
        System.out.println("Enter word 1");
        word1 = in.nextLine();
        System.out.println("Enter word 2");
        word2 = in.nextLine();
        System.out.println("Enter word 3");
        word3 = in.nextLine();
        System.out.println("Acronym: "+word1.charAt(0)+
                word2.charAt(0)+word3.charAt(0));
    }
}
