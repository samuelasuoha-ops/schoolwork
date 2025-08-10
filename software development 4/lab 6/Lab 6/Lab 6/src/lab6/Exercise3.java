package lab6;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String reg;
        double cost;
        double totalCost = 0;
        int numInCar;
        int oneOnly = 0;
        int totalNumber =0;
        int numCount;
        boolean moreCars;
        boolean under18;

        System.out.println("Hollyhead Express");
        do{
            System.out.println("Please enter your registration number:");
            reg = in.nextLine();
            System.out.println("Please enter the number of people in the car, "
                    + "including the driver: "+ reg);
            numInCar = in.nextInt();
            if(numInCar == 1){
                cost = 100;
                oneOnly++;
            }
            else
            {
                cost = 100;
                numCount = 1;
                while ( numCount < numInCar){ //subtract 1 for driver
                    System.out.println("Is passenger " + numCount + " under "
                            + "18 years of age: true or false");
                    under18 =  in.nextBoolean();
                    if ( under18 == true)
                    {
                        cost += 10;
                    }
                    else
                    {
                        cost += 20;
                    }
                    numCount++;
                }
            }
            System.out.println("Cost for car "+ reg + "  is : €" + cost);
            totalNumber += numInCar;
            totalCost += cost;
            System.out.println("Are there more cars to board, true or false");
            moreCars = in.nextBoolean();
            in.nextLine();
        }while (moreCars == true);

        System.out.println("Total revenue  €" + totalCost);
        System.out.println("Total numbers carried  " + totalNumber);
        System.out.println("Number of cars with driver only  " + oneOnly);
    }
}
