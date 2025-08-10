import java.util.ArrayList;


public class supermaket {
    private ArrayList<product> products = new ArrayList<>();

    public void addProduct(String name, String brand, int expyear, double purchaseprice, double sellingprice, double vatrate){
        product a = new product(name, brand, expyear, purchaseprice, sellingprice, vatrate);
        products.add(a);
    }

    public void displayList(){
        System.out.println("Products");
        for(int i = 0; i < products.size(); i++){
            System.out.printf("Name: %-9s | Brand: %-22s | " +
                    " Expiry Date: %-14s | Purchase Price: €%,10.2f | Selling Price: €%,10.2f%n", i + 1,
                    products.get(i).getName(), products.get(i).getBrand(), products.get(i).getExpyear(),
                    products.get(i).getPurchaseprice(), products.get(i).getSellingprice(),
                    products.get(i).getVatrate());
        }

    }

    public void calcVAT(){
        double vat;



    }

    public void calcPL(){

        for(int i = 0; i < products.size(); i++){
            System.out.printf("Name: %-9s | Purchase Price: €%,10.2f | Selling Price: €%,10.2f | VAT: %,10.2f | Profit/Loss: €%,10.2f | %%Profit/Loss: %,10.2f%%n", i + 1);

    }
}
