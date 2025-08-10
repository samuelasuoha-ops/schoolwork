package lab7;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] pps = new String[5];
        double grossPay;
        double[] netPay = new double[5];
        double taxPaid;
        double taxB=0;
        double taxC=0;
        double taxD=0;
        int countA=0;
        int countB=0;
        int countC=0;
        int countD=0;
        int i;

        final double TEN=10000;
        final double TWENTY=20000;
        final double FIFTEEN=15000;
        final double FIFTY=50000;
        final double RATE1=.30;
        final double RATE2=.35;
        final double RATE3=.40;

        i=0;

        while (i<pps.length){
            System.out.println("Enter employee pps number: ");
            pps[i]=in.nextLine();
            System.out.println("Enter employee gross pay ");
            grossPay = in.nextDouble();
            in.nextLine();
            if(grossPay <= TEN){
                netPay[i]=grossPay;
                taxPaid=0;
                countA++;
            }
            else if (grossPay > TEN && grossPay <= TWENTY) {
                taxPaid=((grossPay-TEN)*RATE1);
                netPay[i]=grossPay-taxPaid;
                taxB=taxB+taxPaid;
                countB++;
            }
            else if(grossPay > TWENTY && grossPay <= FIFTY){
                taxPaid = ((grossPay-TEN)*RATE2);
                netPay[i]=grossPay-taxPaid;
                taxC=taxC+taxPaid;
                countC++;
            }
            else{
                taxPaid = ((grossPay - FIFTEEN) * RATE3);
                netPay[i] = grossPay - taxPaid;
                taxD= taxD + taxPaid;
                countD++;
            }
            System.out.println(pps[i] + " has gross pay of €"+grossPay);
            System.out.println("Paid tax of €"+taxPaid +" and has net pay of: €"+netPay[i]);
            i+=1;
        }
        System.out.printf("%10s%10s%n","PPS Number", "Net Pay");
        i=0;
        while(i<pps.length){
            System.out.println(pps[i] +"  " +netPay[i]);
            i+=1;
        }
        System.out.println("Tax paid in each bracket");
        System.out.println("Total Tax Type B: "+taxB);
        System.out.println("Total Tax Type C: "+taxC);
        System.out.println("Total Tax Type D: "+taxD);
        System.out.println("Total numbers in each bracket");
        System.out.println("Number in Type A: "+countA);
        System.out.println("Number in Type B: "+countB);
        System.out.println("Number in Type C: "+countC);
        System.out.println("Number in Type D: "+countD);

    }
}
