package ex2;

import java.util.Scanner;

public class TestEx2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] scores = new int[5];
        int max;
        System.out.println("Enter 5 scores");
        for(int i=0;i<scores.length;i++){
            scores[i] = in.nextInt();
        }

        max=scores[0];
        for(int i=0;i<scores.length;i++){
            if (scores[i]>max)
                max = scores[i];
        }

        System.out.println("The highest score is "+max);
        for(int i=0;i<scores.length;i++){
            System.out.println(scores[i] + " differs from max by " + (max-scores[i]));
        }

    }
}
