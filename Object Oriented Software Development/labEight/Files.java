//Student ID: C00305107
//Date: 12/02/2025
package labEight;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Files {
    // This is the method to write an array of strings to a file
    public static void writeToFile(String filename, String[] lines) {
        try {
            File file = new File(filename);
            // This checks if file exists and creates it if not
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file);
            for (String line : lines) {
                writer.write(line + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // This is the method to get current time formatted as dd-MM HH:mm:ss
    public static String getTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM HH:mm:ss");
        return formatter.format(new Date());
    }

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Pear", "Banana"};
        writeToFile("Fruit.txt", fruits);
        
        try {
            FileWriter fw = new FileWriter("Amount.txt", true);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Enter a new Amount (or Q to quit): ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("Q")) {
                    break; // Exits loop if user inputs 'Q'
                }
                fw.write("Amount:" + input + " " + getTime() + " UPDATED\n");
            }
            fw.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
