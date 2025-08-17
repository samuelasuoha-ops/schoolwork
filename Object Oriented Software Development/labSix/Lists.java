// Student number: C00305107
// Date: 10/11/2024

package labSix;

import java.util.Random;
import java.util.Scanner;

public class Lists {

    // This is the method to find the difference between the largest and smallest numbers
    public static int difference(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array should not be empty");
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        return max - min;
    }

    // This is the method to check if a user-entered number is in the array
    public static void match() {
        int[] numbers = new int[5];
        Random random = new Random();

        // This generates 5 random numbers between 0 and 10
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(11); // Random number from 0 to 10
        }

        // This asks the user for a number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int userNumber = scanner.nextInt();
        boolean found = false;

        // This checks if the number is in the array
        for (int num : numbers) {
            if (num == userNumber) {
                found = true;
                break;
            }
        }

        // Outputs the result
        if (found) {
            System.out.println("Match found");
        } else {
            System.out.print("Not found, numbers were ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        // This closes the scanner
        scanner.close();
    }

    // This is the method to print an ASCII box
    public static void asciiBox() {
    	int[][] vals = new int[][]{ 
			{32,32,95,95,95,95}, 
			{32,47,92,95,95,95,92}, 
			{47,92,32,92,95,95,95,92},
			{92,32,92,47,32,47,32,47},
			{32,92,47,95,47,95,47},
			{}
		};


        // This prints the ASCII box
        for (int i = 0; i < vals.length; i++) {
            for (int j = 0; j < vals[i].length; j++) {
                System.out.print((char)vals[i][j]);
            }
            System.out.println();
        }
    }

    // The main method to test each task
    public static void main(String[] args) {
        // Testing of the difference method
        int[] numbers = {56, 12, 78, 54, 90, 3};
        System.out.println("Difference: " + difference(numbers));

        // Testing of the match method
        match();

        // Testing of the asciiBox method
        asciiBox();
    }
}
