/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex2;

public class TestStudent {
 public static void main(String args[])
 {
  
      final int SCORE = 70;
      double average;
     //create student object & populate
     Student s2 = new Student();
     
     s2.setStudentID("X0001234"); ;
     s2.setName("Jack Kelly"); ;
     s2.setSubject("Software Development"); ;
     s2.setCa1Result(67);
     s2.setCa2Result(90);
     
     s2.print();
     System.out.println();

     PrintCard jackscard = new PrintCard();
     jackscard.setAccountNumber("99999");
     jackscard.setPassword("ghghgh");
     jackscard.setNumberCredits(200);

     jackscard.print();
     average =  (s2.getCa1Result()+ s2.getCa2Result()) / 2;

     /* determine if jacks average warrents bonus print credits*/
     if (average >= SCORE)
     {
      jackscard.setNumberCredits(400);
      System.out.println("Jack's average is >= 70 so his new balance is "+jackscard.getNumberCredits());
     }
    
    }
    
}
