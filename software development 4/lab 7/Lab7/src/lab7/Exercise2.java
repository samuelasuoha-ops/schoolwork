package lab7;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        String[] candidate = new String[5]; // candidates last name
        int[] votes = new int[5]; // candidates votes
        double[] percentage = new double[5]; // candidates percentage

        double sum = 0; // total votes

        //loop for assigning values to the last names and the votes

        for(int i = 0; i < candidate.length; i++)
        {
            System.out.println("Please enter candidates last name: ");
            candidate[i] = in.next();
            System.out.println("Please enter the total votes for " + candidate[i]);
            votes[i] = in.nextInt();
            sum += votes[i];
        }

        // percentage of total votes for each candidate
        for(int i = 0; i < votes.length; i++)
        {
            percentage[i] =  (votes[i] /  sum) * 100.0;
        }

        int maxIndex = 0; // this will hold the index of the winner

        // determining the winner
        for (int i = 0; i < votes.length; i++)
        {
            if(votes[i] > votes[maxIndex]){
                maxIndex = i;
            }
        }
        // results
        System.out.println("\nThe result of the election is:" + "\n");


        System.out.printf("%15s%15s%25s%n","Candidate","Votes","% of Total Votes");

        for(int i = 0; i < votes.length; i++)
        {
            System.out.printf("%15s%15s%15.2f%n",candidate[i], votes[i], percentage[i]);
        }

        System.out.println("\n"+"Total Votes:: "+sum);
        System.out.println("\n" + "The winner of the election is: " + candidate[maxIndex]);

    }
}
