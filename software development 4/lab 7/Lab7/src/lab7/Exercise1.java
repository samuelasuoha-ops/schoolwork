package lab7;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        //constants and variables define
        final int NUM_MACHINES = 4;
        final double RATE1 = 0.50;
        final double RATE2 = 0.40;
        final double RATE3 = 0.30;
        final int LIMIT=1000;
        Scanner in = new Scanner(System.in);
        int[]codes = new int[4];
        int numberOver = 0, weeklyProd,totalProd =0, productionNo = 0;
        double  weeklyCost, totalCost = 0,dailyCost;
        int maxDays;

        //nested loop - outer loop to gather details for each machine and inner
        //loop to get the details for each day
        for (int numMach = 0; numMach < NUM_MACHINES; numMach++){
            System.out.println("Enter machine "+ (numMach+1) + "'s code: ");
            codes[numMach] = in.nextInt();
            weeklyCost = 0;     //re-initialise for each machine
            weeklyProd = 0;
            System.out.println("How many days was machine " + codes[numMach] +
                    " operational?");
            maxDays = in.nextInt();
            for (int numDays = 1; numDays <= maxDays; numDays++){
                System.out.println("Machine: "+ codes[numMach]  + " please enter "
                        + "your production for day " + numDays);
                productionNo= in.nextInt();
                if (productionNo < 100){
                    dailyCost = productionNo * RATE1;
                }
                else if (productionNo >=  100  && productionNo <= 400){
                    dailyCost = productionNo * RATE2;
                }
                else{
                    dailyCost = productionNo * RATE3;
                }
                System.out.println( "Machine "+ codes[numMach]  + "  for day "
                        + numDays + " produced " + productionNo +
                        " units at a cost of €" + dailyCost  );
                System.out.println();
                weeklyCost += dailyCost;
                weeklyProd += productionNo;
            }
            //output the machine production details and cost
            System.out.println( "Machine " + codes[numMach] +
                    " Your weekly production for this week is " +weeklyProd +
                    " at a cost of €" + weeklyCost);
            System.out.println();

            if (weeklyProd >  LIMIT){
                numberOver++;
            }
            totalCost += weeklyCost;
            totalProd += weeklyProd;
        }

        //display overall totals
        System.out.println("The weekly cost for this week is €" + totalCost);
        System.out.println("The weekly production for this week is " + totalProd);
        System.out.println("The number of machines who produced over 1000 is "
                + numberOver);
        System.out.println(" Thank you ");

    }
}
