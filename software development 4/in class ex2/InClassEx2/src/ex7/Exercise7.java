package ex7;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int type;
        int priceOak=225;
        int pricePine = 100;
        int priceMahogany = 310;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for Oak, 2 for Pine or 3 for Mahogany");
        type = in.nextInt();

        if(type == 1){
            System.out.println("You chose oak and the price is "+priceOak);
        }else if (type == 2){
            System.out.println("You chose pine and the price is "+pricePine);
        }else if(type == 3){
            System.out.println("You chose mahogany and the price is "+priceMahogany);
        }else {
            System.out.println("Invalid code the price is 0");
        }
    }
}
