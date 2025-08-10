package ex1;

public class Employee {

    private String name;
    private int employeeNumber;
    private double wagesPerHour;
    private int numHoursperWeek;
    protected double weeklySalary;  //protected to allow access from sub classes

    //parameterised constructor
    public Employee(String empName, int empNumber, double wageRate, int hoursWorked) {
        name = empName;
        employeeNumber = empNumber;
        wagesPerHour = wageRate;
        numHoursperWeek = hoursWorked;
    }

    //getter methods
    public double getHoursWorked() {
        return this.numHoursperWeek;
    }

    public double getWagesRate() {
        return this.wagesPerHour;
    }

    public String getName() {
        return name;
    }

    //calculate and sets the weeklySalary
    public void calculateSalary() {
        this.weeklySalary = this.wagesPerHour * this.numHoursperWeek;

    }

    //prints the employee's details
    public void print() {
        System.out.println("Name          : " + name);
        System.out.println("Number        : " + employeeNumber);
        System.out.println("WageRate      : " + wagesPerHour);
        System.out.println("HoursPer Week : " + numHoursperWeek);
        System.out.println("Weekly Salary : " + weeklySalary);
    }
}




