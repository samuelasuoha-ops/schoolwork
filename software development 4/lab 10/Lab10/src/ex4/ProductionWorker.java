/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex4;


public class ProductionWorker extends Employee
{
   // Constants for the day and night shifts.
   public  final int DAY_SHIFT = 1;
   public  final int NIGHT_SHIFT = 2;

       
   private double payRateD;    // The employee's pay rate for days
   private double payRateN;     // The employee's pay rate for days
   private double dailyPay[];


   public ProductionWorker(String n, String num, String date,
                            double rateD, double rateN,int daysWorked)
   {
      super(n, num, date);
      payRateD = rateD;
      payRateN = rateN;
      dailyPay = new double[daysWorked];
   }

   public ProductionWorker()
   {
      super();
     
      payRateD = 0.0;
      payRateN = 0.0;
      dailyPay = new double[5];
   }

   
   public void setPayRateD(double p)
   {
      payRateD = p;
   }

   public double getPayRateD()
   {
      return payRateD;
   }
   
   public double getPayRateN()
   {
      return payRateN;
   }
   
   public void calculatePay(int dayNumber, int hours,int shift){
       if (shift == DAY_SHIFT){
           dailyPay[dayNumber -1] = hours *payRateD;
        }
       else {
           dailyPay[dayNumber -1] = hours *payRateN;
       }
   }
   public void printPay(){
       for(int i = 0; i < dailyPay.length; i++){
            System.out.println("Pay for day " + (i+1)+ " : "+ dailyPay[i] );
       }
   }
   public double totalPay(){
       double total =0;
        for(int i = 0; i < dailyPay.length; i++){
            total += dailyPay[i];
        }
         return total;
   }
   public void print(){
       super.print();
       System.out.println("Total Pay Due €" + totalPay() );
   }
}

