public class car {
    private String carmake;
    private String carmodel;
    private double purchaseprice;
    private double shippingcost;
    private char port;
    private double sellingprice;

    public car(double purchaseprice, double shippingcost, char port, String carmake, String carmodel, double sellingprice){
        this.purchaseprice=purchaseprice;
        this.shippingcost=shippingcost;
        this.port=port;
        this.carmake=carmake;
        this.carmodel=carmodel;
        this.sellingprice=sellingprice;
    }

    public double getPurchaseprice() { return purchaseprice ; }

    public void setPurchaseprice(double purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public double getShippingcost() {
        return shippingcost;
    }

    public void setShippingcost(double shippingcost) {
        this.shippingcost = shippingcost;
    }

    public String getCarmake() {
        return carmake;
    }

    public void setCarmake(String carmake) {
        this.carmake = carmake;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public char getPort() {
        return port;
    }

    public void setPort(char port) {
        this.port = port;
    }

    public double getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(double sellingprice) {
        this.sellingprice = sellingprice;
    }

    public String getPortName() {
        if (port == 'o') {
            return "Osaka";
        } else {
            return "Tokyo";
        }
    }


}

