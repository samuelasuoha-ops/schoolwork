/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex2;

public class PrintCard {
   
 String  accountNumber;
 String  password;
 int  numberCredits;
 
 public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
 }

 public void setPassword(String password) {
        this.password = password;
}

 public void setNumberCredits(int numberCredits) {
        this.numberCredits = numberCredits;
}

public int getNumberCredits() {
    return numberCredits;
}
 
 
 public void print()
 {
  System.out.printf("%16s%20s%n","Account Number:", accountNumber);
  System.out.printf("%16s%20s%n","Password:",password);
  System.out.printf("%16s%20d%n","Number Credits:",numberCredits);
 }
 
    
}
