import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFlight {
    public static void main(String args[]) {
        Flight f = new Flight(200, 3.5);
        String name = null;
        int age=0;
        int[] bagWeights;
        char[] bagSizes;
        int i;
        int j;

        File inFile = new File("files", "data.txt");
        try (Scanner in = new Scanner(inFile)) {
            while (in.hasNextLine()) {
                bagWeights = new int[3];
                bagSizes = new char[3];
                i = 0;
                j = 0;
                String line = in.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(",");
                while (lineScanner.hasNext()) {
                    name = lineScanner.next();
                    age = lineScanner.nextInt();
                    bagWeights[i++] = lineScanner.nextInt();
                    bagWeights[i++] = lineScanner.nextInt();
                    bagWeights[i] = lineScanner.nextInt();
                    bagSizes[j++] = lineScanner.next().charAt(0);
                    bagSizes[j++] = lineScanner.next().charAt(0);
                    bagSizes[j] = lineScanner.next().charAt(0);
                }
                Passenger p = new Passenger(name,age,bagWeights,bagSizes);
                f.fillList(p);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Problem: " + ex.getMessage());
        }

        System.out.println("Passenger List for Flight ");
        f.printList();
        System.out.println("Number seats available:" + f.checkAvailability());
        System.out.println(f.calcOldestPassenger());
    }
}

