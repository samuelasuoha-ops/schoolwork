/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex4;

import java.util.Scanner;
public class TestEmployee {

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      // Create a ProductionWorker object and pass the initialization
      // data to the constructor.
      int hours;
      int shift;
      int daysWorked;
      System.out.println("Enter the number of days worked");
      daysWorked = in.nextInt();
      ProductionWorker pw =
           new ProductionWorker("John Smith", "e123-A", "11-15-2005",
                                100.00,130.00, daysWorked);
      
      // Display the data.
      for(int i = 0; i < daysWorked; i++){
           System.out.println("Did you work the day of night shift for day "+ (i+1) +" ? Enter 1 for day, 2 for night");
           shift = in.nextInt();
           while ((shift !=1)  && (shift != 2)){
               System.out.println("Error in input - re-enter shift type please");
               shift = in.nextInt();
           }
           System.out.println("How many hours did you work?");
           hours = in.nextInt();
           pw.calculatePay(i +1,hours,shift);

      }
      pw.print();
      
      
   }
}
    
