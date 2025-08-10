package ex1;

public class Trainee extends Employee {

    private int hoursofTraining;

    //constructor which passes required data up to superclass and the initialises
    //hoursofTraining
    public Trainee(String empname, int empnumber, double wagerate,
                   int hoursworked, int traininghours) {
        super(empname, empnumber, wagerate, hoursworked); //pass data to super class sonstructor
        this.hoursofTraining = traininghours;
    }

    //override calculateSalary()method
    //call calculate salary from superclass and add additional calculations
    //can directly access weeklySalary as itis "protected"
    public void calculateSalary() {
        super.calculateSalary();
        weeklySalary += (hoursofTraining * 5);
    }

    ////override print()method
    public void print() {
        super.print();   //call super class print method to print those details then print training hours
        System.out.println("Trainee Hours: " + hoursofTraining);
    }
}




