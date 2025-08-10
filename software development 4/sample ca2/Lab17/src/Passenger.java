public class Passenger {
        private String name;
        private int age;
        private int bagWeights[];
        private char bagSize[];

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getBagWeights() {
        return bagWeights;
    }

    public void setBagWeights(int[] bagWeights) {
        this.bagWeights = bagWeights;
    }

    public char[] getBagSize() {
        return bagSize;
    }

    public void setBagSize(char[] bagSize) {
        this.bagSize = bagSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passenger(String name, int age, int[] bw, char[] sizes) {
            this.name = name;
            this.age = age;
            bagWeights=bw;
            bagSize = sizes;
        }

        public double calcBaggageCharge() {

            double charge = 0.0;
            double excessWeightCharge;
            double totalWeightPaidFor = 0.0;
            double actualWeight = 0.0;
            double excessWeight = 0.0;
            double totalCharge;
            int OVERWEIGHT_BAG_CHARGE = 10;
            int MEDIUM_WEIGHT = 15;
            int LARGE_WEIGHT = 20;
            int MEDIUM_CHARGE = 30;
            int LARGE_CHARGE = 40;

            for (int i = 0; i < bagSize.length; i++) {

                if (bagSize[i] == 'm') {
                    charge += MEDIUM_CHARGE;
                    totalWeightPaidFor += MEDIUM_WEIGHT;

                    actualWeight += bagWeights[i];
                }
                else if (bagSize[i] == 'l') {
                    charge += LARGE_CHARGE;
                    totalWeightPaidFor += LARGE_WEIGHT;
                    actualWeight += bagWeights[i];
                }
            }

            if (actualWeight > totalWeightPaidFor) {
                excessWeight = actualWeight - totalWeightPaidFor;
            }
            excessWeightCharge = excessWeight * OVERWEIGHT_BAG_CHARGE;
            totalCharge = charge + excessWeightCharge;

            return totalCharge;
        }
}
