package ex2;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private final double salary;
    private double earnings;

    public BasePlusCommissionEmployee(String fName, String lName, String ssn,
                                      double grossSales, double rate, double base){
        super(fName,lName,ssn,grossSales,rate);
        this.salary=base;
        earnings = calcEarnings();
    }

    public double calcEarnings(){
        return salary+super.calcComm();
    }

    public double getEarnings(){
        return earnings;
    }
}
