package ex2;

import java.util.Scanner;

public class TestEx2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result;
        int gradeCount=0;
        int aCount=0;
        int bCount=0;
        int cCount=0;
        int dCount=0;
        int fCount=0;

        final int SENTINEL=-1;

        System.out.println("Enter a result");
        result = in.nextInt();

        while(result != SENTINEL){
            gradeCount +=1;
            if(result>=90)
                aCount +=1;
            else if(result >=80)
                bCount +=1;
            else if(result>=70)
                cCount +=1;
            else if(result >=60)
                dCount +=1;
            else if(result >=0)
                fCount +=1;

            System.out.println("Enter a result");
            result = in.nextInt();
        }
        if (gradeCount ==0)
            System.out.println("No data entered");
        else{
            System.out.println("Total number of grades is: "+gradeCount);
            System.out.println("Number of A's is: "+aCount);
            System.out.println("Number of B's is: "+bCount);
            System.out.println("Number of C's is: "+cCount);
            System.out.println("Number of D's is: "+dCount);
            System.out.println("Number of F's is: "+fCount);
        }

    }
}
