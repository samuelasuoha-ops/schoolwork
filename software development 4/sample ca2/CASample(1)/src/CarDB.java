import java.util.ArrayList;

public class CarDB {

    private ArrayList<Car> cars = new ArrayList<>();
    private double[] totalCost;

    public void addCar(String make, String model, double cost, double sCost, char port, double sellingPrice) {
        Car c = new Car(make, model, cost, sCost, port, sellingPrice);
        cars.add(c);
    }

    public void displayList() {
        System.out.println("Cars");
        for (int i = 0; i < cars.size(); i++) {
            System.out.printf("No:%2d |Make: %-10s | Model: %-20s | Purchase Price: €%,10.2f  | "
                    + "Shipping Cost €%5.2f | Port: %-5s | Selling Price: €%,10.2f%n", i + 1,
                    cars.get(i).getMake(), cars.get(i).getModel(),
                    cars.get(i).getCost(), cars.get(i).getShippingCost(),
                    cars.get(i).getPortName(), cars.get(i).getSellingPrice());
        }
    }
    public void calcMostExpensive() {
        double max = Double.MIN_VALUE;

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getSellingPrice() > max) {
                max = cars.get(i).getSellingPrice();
            }
        }
        System.out.println("Most Expensive Cars");
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getSellingPrice() == max) {
                System.out.printf("%-20s at €%,10.2f%n", cars.get(i).getModel(), +cars.get(i).getSellingPrice());
            }
        }
    }


    public void calcImportDuty() {
        double costplusshipping;
        double portDuty;
        double vat;
        double unload;
        double importCost;
        double OSAKA_RATE = .1;
        double OSAKA_UNLOAD_FEE = 100;
        double TOKYO_RATE = .15;
        double TOKYO_UNLOAD_FEE = 150;
        double VAT_RATE = .23;
        double BROKER_FEE = 120;

        totalCost = new double[cars.size()];
        System.out.printf("%-25s | %-10s  | %-12s| %-10s %n", "Model", "Cost", "Import Cost", "Total Cost");
        for (int i = 0; i < cars.size(); i++) {
            costplusshipping = cars.get(i).getCost() + cars.get(i).getShippingCost();
            if (cars.get(i).getPort() == 'o') {
                portDuty = costplusshipping * OSAKA_RATE;
                unload = OSAKA_UNLOAD_FEE;
            } else {
                portDuty = costplusshipping * TOKYO_RATE;
                unload = TOKYO_UNLOAD_FEE;
            }
            vat = (costplusshipping + portDuty) * VAT_RATE;
            importCost = portDuty + vat + unload + BROKER_FEE;
            totalCost[i] = cars.get(i).getCost() + cars.get(i).getShippingCost()+importCost;

            System.out.printf("%-25s | €%-,10.2f | €%-,10.2f | €%-,10.2f%n", cars.get(i).getModel(),
                    cars.get(i).getCost()+cars.get(i).getShippingCost(), importCost, totalCost[i]);

        }
    }

}
