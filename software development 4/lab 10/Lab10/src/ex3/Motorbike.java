package ex3;

public class Motorbike extends Rental {
	public Motorbike(String rentalName, int rentalPeriod) {
		super(rentalName, rentalPeriod);
	}

	public double calculateCost() {
		double cost = 0.0;
		if (getRentalPeriod() > 10) {
			cost = getRentalPeriod() * 25.50;
		} else {
			cost = getRentalPeriod() * 35.50;
		}
		return cost;
	}
}
