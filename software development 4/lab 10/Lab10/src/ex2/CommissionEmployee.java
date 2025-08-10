package ex2;

public class CommissionEmployee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String fName, String lName, String ssn,
                              double grossSales, double rate) {
        this.firstName = fName;
        this.lastName = lName;
        this.socialSecurityNumber = ssn;
        if (grossSales < 0) {
            this.grossSales = 0;
        } else {
            this.grossSales = grossSales;
        }

        if (rate >= 0.0 && rate < 1.0) {
            commissionRate = rate;
        } else {
            commissionRate = 0;
        }
    }

        public String getSsn()
        {
            return socialSecurityNumber;
        }
        public double getGrossSales(){
            return grossSales;
        }

        public double calcComm(){
            return grossSales*commissionRate;
        }
    }

