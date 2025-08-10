import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestCarDB {

    public static void main(String[] args) {

        String make = null;
        String model = null;
        double cost = 0.0;
        double fee = 0.0;
        char port = ' ';
        double sellingPrice = 0.0;

        File inFile = new File("files", "cars.txt");
        CarDB cardb = new CarDB();
        try (Scanner in = new Scanner(inFile)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(",");
                while (lineScanner.hasNext()) {
                    make = lineScanner.next();
                    model = lineScanner.next();
                    cost = Double.parseDouble(lineScanner.next());
                    fee = Double.parseDouble(lineScanner.next());
                    port = lineScanner.next().charAt(0);
                    sellingPrice = Double.parseDouble(lineScanner.next());
                }
                cardb.addCar(make, model, cost, fee, port, sellingPrice);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Problem: " + ex.getMessage());
        }

        while (true) {
            System.out.println("Please press 1 to view the cars");
            System.out.println("Please press 2 to view the car(s) with the highest selling price");
            System.out.println("Please press 3 to view the import duty");
            System.out.println("Press 4 to quit");

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    cardb.displayList();
                    break;
                case 2:
                    cardb.calcMostExpensive();
                    break;
                case 3:
                    cardb.calcImportDuty();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
