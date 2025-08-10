package ex3;

public class Car extends Rental
{
	private boolean sports;
	public Car(String rentalName, int rentalPeriod, boolean sports) 
	{
		super(rentalName, rentalPeriod);
		this.sports = sports;		
	}

	public double calculateCost() 
	{
		double cost = 0.0;
		if(sports == true)
		{
			cost = 75 * getRentalPeriod();
		}
		else
		{
			cost = 50 * getRentalPeriod();
		}
		return cost;
	}
}
