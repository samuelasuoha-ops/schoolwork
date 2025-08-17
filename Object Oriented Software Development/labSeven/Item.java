//Student ID: C00305107
//Date: 28/01/2025
package labSeven;
//import java.util.Random;
public class Item {
    private int price;
    private int stock;

    // This is the constructor
    public Item() {
        this.price = 0;
        this.stock = 0;
    }

    // This is the getter and setter methods
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
