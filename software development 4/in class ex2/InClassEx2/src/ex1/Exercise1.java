package ex1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gpa;
        System.out.println("Please enter a GPA value");
        gpa = in.nextDouble();

        if(gpa >= 2.5){
            System.out.println("You received a merit");
        }else if(gpa>=2 && gpa <=2.49){
            System.out.println("You received a pass");
        }else{
            System.out.println("Sorry you received a fail");
        }

    }
}
