package ex2;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        final int NUMBER_ROWS = 2;  // Number of regions
        final int NUMBER_COLS = 3;  // Number of months
        Scanner in = new Scanner(System.in);
        double sum;
        double[][] rain = new double[NUMBER_ROWS][NUMBER_COLS];

        // read in the values
        for (int i = 0; i < NUMBER_ROWS; i++) {
            for (int j = 0; j < NUMBER_COLS; j++) {
                System.out.println("What is the rainfall for month " + (j + 1)
                        + " in area " + (i + 1) + "?");
                rain[i][j] = in.nextDouble();
            }
        }
        // print the headings
        System.out.printf("%7s%6s%6s%6s%20s%n","Region","Jan","Feb","Mar","Average Rainfall");

        // print out the values
        for (int i = 0; i < NUMBER_ROWS; i++) {
            sum = 0;
            System.out.printf("%6d",i+1);
            for (int j = 0; j < NUMBER_COLS; j++) {
                System.out.printf("%7.2f",rain[i][j]);
                sum = sum + rain[i][j];
            }
            System.out.printf("%10.2f %n", (sum/NUMBER_COLS));
        }
    }
}

