package ex6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] first = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int[] second = { 3, 1, 9, 6, 0, 4, 3, 5, 7, 9, 2, 3 };
        int numRight = 0;
        int numWrong = 0;
        for(int i = 0; i < first.length; i++)
        {
            for(int j = 0; j < second.length; j++)
            {
                if(numWrong < 3)
                {
                    System.out.println(first[i] + " + " + second[j] + " = ?");
                    int answer = input.nextInt();
                    if(answer == (first[i] + second[j]))
                    {
                        numRight++;
                    }
                    else
                    {
                        numWrong++;
                        if(numWrong == 3)
                        {
                            System.out.println("Sorry, you have answered 3 questions incorrectly");
                        }
                    }
                }
            }
        }
        System.out.println("You answered " + numRight + " correctly");
    }
}
