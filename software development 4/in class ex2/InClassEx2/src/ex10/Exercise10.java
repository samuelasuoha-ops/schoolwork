package ex10;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        int numDaysMonth=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Input a month number");
        int month = in.nextInt();

        numDaysMonth = switch(month){
            case 1,3,5,7,8,10,12 -> 31;
            case 2 -> 28;
            case 4,6,9,11 -> 30;
            default -> 0;
        };
        if (numDaysMonth==0){
            System.out.println("Invalid number entered");
        }else {
            System.out.println(numDaysMonth + " days");
        }
    }
}
