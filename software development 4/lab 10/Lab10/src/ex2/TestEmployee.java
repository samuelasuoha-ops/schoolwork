package ex2;

public class TestEmployee {
    public static void main(String[] args) {
        CommissionEmployee ce1 = new CommissionEmployee("John","Smith","0902001",
                20000,.05);
        BasePlusCommissionEmployee bpce1 = new BasePlusCommissionEmployee("Mary", "Jones",
                "0904681",30000,.06,500);

        System.out.println("SSN: "+ce1.getSsn());
        System.out.println("Gross Sales: "+ ce1.getGrossSales());
        System.out.println();

        System.out.println("SSN: "+bpce1.getSsn());
        System.out.println("Gross Sales: "+ bpce1.getGrossSales());
        System.out.println();
        System.out.println("Earnings");
        System.out.printf("€%,.2f%n",ce1.calcComm());
        System.out.printf("€%,.2f",bpce1.calcEarnings());

    }
}
