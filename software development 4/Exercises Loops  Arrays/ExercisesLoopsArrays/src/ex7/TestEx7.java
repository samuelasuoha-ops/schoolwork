package ex7;

import java.util.Scanner;

public class TestEx7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] monthName = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        double[] rainfall = new double[12];
        double[] quarterAverage = new double[4];
        double annualAverage, sum=0.0;
        double oddMonthSum=0, oddMonthAverage, evenMonthSum=0, evenMonthAverage;

        for(int i=0; i<rainfall.length;i++){
            System.out.println("Enter rainfall for: "+monthName[i]);
            rainfall[i] = in.nextDouble();
            sum += rainfall[i];
        }
        annualAverage = sum/rainfall.length;
        System.out.println("Annual Average Rainfall: "+annualAverage);
        //Compute average for even month numbers
        for(int i=0; i<rainfall.length;i+=2){
            evenMonthSum += rainfall[i];
        }
        System.out.println("Average Rainfall for even months is: "+evenMonthSum/(rainfall.length/2));

        //Compute average for odd month numbers
        for(int i=1; i<rainfall.length;i+=2){
            oddMonthSum += rainfall[i];
        }
        System.out.println("Average Rainfall for odd months is: "+oddMonthSum/(rainfall.length/2));

        //Compute an output the average rainfall for each quarter
        for(int i=0;i<4;i++){
            sum = 0;
            for(int j=0;j<3;j++){
                sum += rainfall[3*i+j];
            }

            quarterAverage[i] = sum/3.0;
            System.out.println("Rainfall Average for Qtr "+(i+1)+ ": "+quarterAverage[i]);
        }

    }
}
