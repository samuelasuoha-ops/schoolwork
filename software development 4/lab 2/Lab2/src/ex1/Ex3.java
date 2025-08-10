package ex1;

public class Ex3 {
    public static void main(String[] args) {
        int numberPeople=30;
        double totalDistanceKms=100;
        double averageDistanceKms=0.0;

        averageDistanceKms=totalDistanceKms/numberPeople;
        System.out.println("The number of people in the class is: "+numberPeople);
        System.out.println("The total distance students have to travel to college every day: "+totalDistanceKms);
        System.out.printf("The average distance traveled in Kms is: %.2f%n", averageDistanceKms);
    }
}
