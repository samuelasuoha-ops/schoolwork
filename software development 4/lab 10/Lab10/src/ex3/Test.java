package ex3;
public class Test 
{
	public static void main(String[] args) 
	{
		Car sportsCar = new Car("John Murphy", 10, true);
		Car familyCar = new Car("Molly Malone", 5, false);
		Motorbike longRentBike = new Motorbike("Joe Bloggs", 20);
		Motorbike shortRentBike = new Motorbike("Jane Doe", 4);
		
		sportsCar.displayDetails();
		System.out.println("Cost is " + sportsCar.calculateCost());
		
		familyCar.displayDetails();
		System.out.println("Cost is " + familyCar.calculateCost());
		
		longRentBike.displayDetails();
		System.out.println("Cost is " + longRentBike.calculateCost());
		
		shortRentBike.displayDetails();
		System.out.println("Cost is " + shortRentBike.calculateCost());
	}
}
