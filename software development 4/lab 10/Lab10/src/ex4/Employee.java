/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex4;

public class Employee
{
   private String name;             // Employee name
   private String employeeNumber;   // Employee number
   private String hireDate;         // Employee hire date
   

   public Employee(String n, String num, String date)
   {
      name = n;
      if (num.charAt(0) != 'e')
          employeeNumber = "";
      else
          employeeNumber = num;
      hireDate = date;
   }


   public Employee()
   {
      name = "";
      employeeNumber = "";
      hireDate = "";
   }
   
   public void setName(String n)
   {
      name = n;
   }


   public void setHireDate(String h)
   {
      hireDate = h;
   }


   public String getName()
   {
      return name;
   }

   /**
      The getEmployeeNumber method returns the
      employee's number.
      @return The employee's number.
   */

   public String getEmployeeNumber()
   {
      return employeeNumber;
   }


   public String getHireDate()
   {
      return hireDate;
   }

   public void print(){
       System.out.println("Employee Name: "+name);
       System.out.println("Employee Number: "+employeeNumber);
       System.out.println("Employee Hire Date: "+hireDate);
   }
  
}

