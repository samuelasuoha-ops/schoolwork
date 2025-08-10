package ex2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countEuro = 0;
        int count50 = 0;
        int count20 = 0;
        int count10 = 0;
        int count5 = 0;
        int count1 = 0;

        int change;
        int purchasePrice;
        int amtTendered;
        int origChange;

        System.out.println("Please enter the purchase price in cents?");
        purchasePrice = in.nextInt();
        System.out.println(purchasePrice);
        System.out.println("Please enter the amount tendered?");
        amtTendered = in.nextInt();

        change = amtTendered - purchasePrice;
        origChange = change;

        if(change <0){
            System.out.println("Not enough change was tendered");
            System.exit(1);
        }

        if(change > 0)
        {
            if(change/100>0){
                countEuro = countEuro + (change/100);
                change = change % 100;
            }
            if(change/50>0){
                count50 = count50 + (change/50);
                change = change % 50;
            }
            if(change/20>0){
                count20 = count20 + (change/20);
                change = change % 20;
            }
            if(change/10>0){
                count10 = count10 + (change/10);
                change = change % 10;
            }
            if(change/5>0){
                count10 = count5 + (change/5);
                change = change % 5;
            }
            count1 = count1 + change;
            change = 0;
        }
        double price = purchasePrice;
        double amt = amtTendered;
        double myChange = origChange;

        System.out.printf("Purchase Price €%.2f%n", price/100);
        System.out.printf("Amount Tendered €%.2f%n", amt/100);
        System.out.printf("Your change is €%.2f%n", myChange/100);

        System.out.println(countEuro +" Euro coins");
        System.out.println(count50 +" 50 cent coins");
        System.out.println(count20 +" 20 cent coins");
        System.out.println(count10 +" 10 cent coins");
        System.out.println(count5 +" 5 cent coins");
        System.out.println(count1 +" cents");

        System.out.println("Thank You for your business");

    }
}
