//Student ID: C00305107
//Date: 28/01/2025
package labSeven;
import java.util.Random;
public class ItemTest {
    public static void main(String[] args) {
        // This creates an array of 10 items
        Item[] items = new Item[10];
        Random random = new Random();

        for (int i = 0; i < items.length; i++) {
            items[i] = new Item();
            items[i].setPrice(random.nextInt(20) + 1); // Price between 1 and 20
            items[i].setStock(random.nextInt(7));     // Stock between 0 and 6
        }

        // This prints the table header
        System.out.printf("%-6s | %-6s | %-6s%n", "Index", "Price", "Stock");

        // This prints each item's index, price, and stock in a formatted way
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%-6d   %-6d   %-6d%n", i, items[i].getPrice(), items[i].getStock());
        }

        // Test buyItem and totalPrice methods
        buyItem(items, 2, 3); // Attempt to buy 3 units of item at index 2
        totalPrice(items);   // Print total price of all stock
    }

    // This is method to buy an item
    public static void buyItem(Item[] items, int index, int amount) {
        if (amount > items[index].getStock()) {
            System.out.println("Not enough stock");
        } else {
            int cost = amount * items[index].getPrice();
            items[index].setStock(items[index].getStock() - amount);
            System.out.println("Bought " + amount + " units for " + cost);
        }
    }

    // This is method to calculate the total price of all stock
    public static void totalPrice(Item[] items) {
        int total = 0;
        for (Item item : items) {
            total += item.getPrice() * item.getStock();
        }
        System.out.println("Total price of all stock: " + total);
    }
}
