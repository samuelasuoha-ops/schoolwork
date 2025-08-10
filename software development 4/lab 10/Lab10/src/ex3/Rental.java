package ex3;

public abstract class Rental {
    private String rentalName;
    private int rentalPeriod;

    public Rental(String rentalName, int rentalPeriod) {
        this.rentalName = rentalName;
        this.rentalPeriod = rentalPeriod;
    }

    public int getRentalPeriod() {
        return rentalPeriod;
    }

    public abstract double calculateCost();

    public void displayDetails() {
        System.out.println(rentalName + " has a rental period of "
                + rentalPeriod + " days");
    }
}
