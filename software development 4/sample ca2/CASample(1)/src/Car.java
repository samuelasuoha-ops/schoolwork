public class Car {

    private String make;
    private String model;
    private double purchasePrice;
    private double shippingCost;
    private char port;
    private double sellingPrice;


    public Car(String make, String model, double cost, 
            double sCost, char port, double sellingPrice) {
        this.make = make;
        this.model = model;
        this.purchasePrice = cost;
        this.shippingCost = sCost;
        this.port = port;
        this.sellingPrice = sellingPrice;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCost() {
        return purchasePrice;
    }

    public void setCost(double cost) {
        this.purchasePrice = cost;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public char getPort() {
        return port;
    }

    public void setPort(char port) {
        this.port = port;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    
    public String getPortName() {
        if (port == 'o') {
            return "Osaka";
        } else {
            return "Tokyo";
        }
    }
}
