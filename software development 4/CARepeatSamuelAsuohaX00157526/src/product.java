public class product {
    private String name;
    private String brand;
    private int expyear;
    private double purchaseprice;
    private double sellingprice;
    private double vatrate;

    public product(String name, String brand, int expyear, double purchaseprice, double sellingprice, double vatrate){
        this.name=name;
        this.brand=brand;
        this.expyear=expyear;
        this.purchaseprice=purchaseprice;
        this.sellingprice=sellingprice;
        this.vatrate=vatrate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getExpyear() {
        return expyear;
    }

    public void setExpyear(int expyear) {
        this.expyear = expyear;
    }

    public double getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(double purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public double getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(double sellingprice) {
        this.sellingprice = sellingprice;
    }

    public double getVatrate() {
        return vatrate;
    }

    public void setVatrate(double vatrate) {
        this.vatrate = vatrate;
    }
}
