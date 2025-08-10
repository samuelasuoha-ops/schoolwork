package ex1;

import java.util.Scanner;

public class TestEx1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String house;
        int sleepHours;
        double averageSleep;
        double sum=0.0;
        int count=0;
        final int SENTINEL =0;

        System.out.println("Please enter the house name: ");
        house = in.nextLine();
        System.out.println("Please enter the sleep hours or 0 stop to stop");
        sleepHours = in.nextInt();

        while(sleepHours!= SENTINEL){
            sum += sleepHours;
            count = count+1;
            System.out.println("Please enter the sleep hours or 0 stop to stop");
            sleepHours = in.nextInt();
        }
        if(count == 0){
            System.out.println("No data entered");
        }else{
            averageSleep = sum/count;
            System.out.println("Average sleep for house is: "+averageSleep);
        }
    }
}
