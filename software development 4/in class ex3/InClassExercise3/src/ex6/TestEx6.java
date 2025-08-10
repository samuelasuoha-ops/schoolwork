package ex6;

import java.util.Scanner;

public class TestEx6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] prices = new double[5];
        double sum=0;
        double average;

        for(int i=0; i<prices.length;i++){
            System.out.println("Enter price "+(i+1));
            prices[i] = in.nextDouble();
            sum += prices[i];
        }

        System.out.println("The sum of all the prices is: "+sum);
        average = sum/prices.length;
        System.out.println("The average of all the prices is: "+average);

        System.out.println("Prices below €5");
        for(int i=0; i<prices.length;i++){
            if(prices[i]<5.0){
                System.out.println(prices[i]);
            }
        }

        System.out.println("Prices greater than the average");
        for(int i=0; i<prices.length;i++){
            if(prices[i]>average){
                System.out.println(prices[i]);
            }
        }

    }
}
