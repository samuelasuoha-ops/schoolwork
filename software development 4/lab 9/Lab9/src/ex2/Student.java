/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex2;

public class Student {
     private String  studentID;
     private String  name;
     private String subject;
     private int  ca1Result;
     private int  ca2Result;
 

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCa1Result() {
        return ca1Result;
    }

    public void setCa1Result(int ca1Result) {
        this.ca1Result = ca1Result;
    }

    public int getCa2Result() {
        return ca2Result;
    }

    public void setCa2Result(int ca2Result) {
        this.ca2Result = ca2Result;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
   
    public void print() {
      System.out.printf("%12s%20s%n", "Student ID: ",studentID);
      System.out.printf("%12s%20s%n","Name: " ,name);
      System.out.printf("%12s%20s%n","Subject: ", subject);
      System.out.printf("%12s%20s%n","CA1 Result: " , ca1Result);
      System.out.printf("%12s%20s%n","CA2 Result: " , ca2Result);
     } 
 
 
 
}
    

