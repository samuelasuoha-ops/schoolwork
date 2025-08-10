package ex9;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        int numDaysMonth=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Input a month number");
        int month = in.nextInt();

        switch(month){
            case 1:
                numDaysMonth = 31;
                break;
            case 2:
                numDaysMonth  =28;
                break;
            case 3:
                numDaysMonth = 31;
                break;
            case 4:
                numDaysMonth = 30;
                break;
            case 5:
                numDaysMonth = 31;
                break;
            case 6:
                numDaysMonth = 30;
                break;
            case 7:
                numDaysMonth = 31;
                break;
            case 8:
                numDaysMonth = 31;
                break;
            case 9:
                numDaysMonth = 30;
                break;
            case 10:
                numDaysMonth = 31;
                break;
            case 11:
                numDaysMonth = 30;
                break;
            case 12:
                numDaysMonth = 31;
                break;
            default:
                System.out.println("Invalid month number entered");
        }
        System.out.println(numDaysMonth + " days");
    }
}
