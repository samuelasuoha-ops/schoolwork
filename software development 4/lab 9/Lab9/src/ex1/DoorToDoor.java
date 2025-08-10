package ex1;

public class DoorToDoor {
    // represents houses in an estate & the sale qty in each
    private int houses[];
    private int sales[];

    // constructor - creates space for the two arrays
    public DoorToDoor(int numHouses) {
        houses = new int[numHouses];
        sales = new int[numHouses];
    }

    public void fillHouses() {
        for (int i = 0; i < houses.length; i++) {
            houses[i] = i + 1;
        }
    }

    public void fillSales(int i, int numSales) {
        sales[i - 1] = numSales;

    }

    public double calcAverageSales() {
        double total = 0;
        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }
        return (total / sales.length);
    }

    public void minSales() {
        int minIndex = 0;
        int minSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("Minimum Sales Value: " + sales[minIndex] + " at house number :"
                + (minIndex + 1));
    }

    public void displayAll() {
        System.out.println("\tHouse Number\tSales\n");
        for (int i = 0; i < houses.length; i++) {
            System.out.println("\t\t\t" + houses[i] + "\t\t" + sales[i]);
        }
    }
}

