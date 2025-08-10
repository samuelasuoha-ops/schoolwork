package ex5;

import java.util.Scanner;

public class TestEx5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] sales = new int[10];
        int totalSales=0;
        int maxIndex;
        int largestSale;

        for(int i=0; i<sales.length;i++){
            System.out.println("Enter sales figure "+ (i+1));
            sales[i] = in.nextInt();
            totalSales += sales[i];
        }

        System.out.println("Sales Figures");
        for(int i=0; i<sales.length;i++){
            System.out.println("Sales Figure "+(i+1)+": "+sales[i]);
        }

        System.out.println("The average sales figure is: "+totalSales/sales.length);
        maxIndex=0;
        for(int i=0; i<sales.length;i++){
            if(sales[maxIndex] <sales[i])
                maxIndex=i;
        }
        largestSale = sales[maxIndex];
        System.out.println("The largest sale was: "+largestSale);
    }
}
