package lab7;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double[]sales;
        String []names;
        int numSalesmen;
        double sum = 0,average,largestSale;
        int i = 0;

        //read in the number of salesmen
        System.out.println("Enter the number of salesmen in the company");
        numSalesmen = in.nextInt();

        //create the arrays
        sales = new double[numSalesmen];
        names = new String[numSalesmen];

        //read in the numbers
        for (i =0; i < sales.length;i++)
        {
            System.out.println("Enter the name of salesman " + (i+1) );
            names[i] = in.next(); //reads a String with no embedded spaces,
            //and there's no need to deal with EOL
            System.out.println("Enter the sales for salesman " + names[i] );
            sales[i] = in.nextDouble();
            sum += sales[i]; //calculate total sales

        }

        //calculate max sales
        int maxIndex =0;
        for ( i =0; i < sales.length;i++)
        {
            if (sales[maxIndex] < sales[i])
                maxIndex = i;

        }
        largestSale = sales[maxIndex];

        System.out.println("The largest Sale was: " + largestSale + " Made by "
                +names[maxIndex]);


        //output report
        System.out.println("\n\n\t\tSales Report");
        System.out.println("Salesman\tSales");

        for (i =0; i < sales.length;i++)
        {
            System.out.println(names[i]+"\t\t" + sales[i] );
        }
    }

}
