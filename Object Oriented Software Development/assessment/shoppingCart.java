// File name: shoppingCart.java
// name: Samuel Asuoha
// student ID: C00305107
// I decided to implement C, the REMOVE ITEM function, as an additional functionality in my shopping list.
package assessment;
import java.util.*;
public class shoppingCart {
    public static void main(String[] args) {
        // This is to initialize scanner and data structure for shopping list
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> shoppingList = new LinkedHashMap<>();
        boolean continueShopping = true;

        // This is the main shopping loop
        while (continueShopping) {
            // this asks if the user wants to add an item
            System.out.print("Do you want to add an item to the basket? [Yy/Nn]: ");
            String response = scanner.nextLine().trim().toLowerCase();

            if (response.equals("y")) {
                // this is the prompt for the name of item
                System.out.print("Enter the item name: ");
                String itemName = scanner.nextLine().trim();

                // this is the prompt for price of item
                System.out.print("Enter the price for the item (e.g., 10.25): ");
                try {
                    double itemPrice = Double.parseDouble(scanner.nextLine().trim());
                    
                    // This si to add or update the item in the shopping list
                    if (shoppingList.containsKey(itemName)) {
                        System.out.println(itemName + " already exists. Updating its price.");
                    }
                    shoppingList.put(itemName, itemPrice);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid price format. Please enter a valid number.");
                }
            } else if (response.equals("n")) {
                // this exits the shopping loop
                continueShopping = false;
            } else {
                // This is the prompt for when there is an invalid input
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
        }

        // this displays the shopping list
        System.out.println("\nShopping List:");
        double totalPrice = 0;
        String mostExpensiveItem = "";
        double maxPrice = 0;

        for (Map.Entry<String, Double> entry : shoppingList.entrySet()) {
            String item = entry.getKey();
            double price = entry.getValue();
            System.out.printf("%s(%.2f), ", item, price);

            // this calculates the total price
            totalPrice += price;

            // this finds the most expensive item
            if (price > maxPrice) {
                maxPrice = price;
                mostExpensiveItem = item;
            }
        }
        
        System.out.println();

        // This is to display the total price and most expensive item
        System.out.printf("Total Price: %.2f€%n", totalPrice);
        System.out.printf("Most expensive item is %s, price is %.2f€%n", mostExpensiveItem, maxPrice);

        // This is my additional functionality to Remove an item from shopping list
        System.out.print("\nWould you like to remove an item? [Yy/Nn]: ");
        String removeResponse = scanner.nextLine().trim().toLowerCase();
        if (removeResponse.equals("y")) {
            System.out.print("Enter the item to remove: ");
            String itemToRemove = scanner.nextLine().trim();
            if (shoppingList.containsKey(itemToRemove)) {
                shoppingList.remove(itemToRemove);
                System.out.println("Item removed successfully.");
                System.out.println("Updated Shopping List:");
                //shoppingList.forEach((item, price) -> System.out.printf("%s(%.2f), ", item, price));
                
                // This is to prevent a comma from appearing in the updated shopping list if there is only one item in it
                int count = 0;
                for (Map.Entry<String, Double> entry : shoppingList.entrySet()) {
                    System.out.print(entry.getKey() + "(" + String.format("%.2f", entry.getValue()) + ")");
                    count++;
                    if (count < shoppingList.size()) {
                        System.out.print(", "); // This will add the comma only between items
                    }
                }
                System.out.println();
            } else {
                System.out.println("Item not found in the shopping list.");
            }
        } else {
            System.out.println("No items removed.");
        }

        // This would close the scanner
        scanner.close();
    }
}



// error log:
// 1.	After implemanting the remove item functionality, I noticed that if i only have two items in my shopping list and i remove one, 
//		my remaining item will have a comma after it, (example: apple(12.85), ). To fix this, I added a loop to edit the updated list and prevent the 
//		comma from appearing after if there is only one item left in the shopping list.

