class Flight {

    private int capacity;
    private double duration;
    private Passenger[] pList;
    private int i=0;

    public Flight(int c, double dur) {
        capacity = c;
        duration = dur;
        pList = new Passenger[4];
    }

    public void fillList(Passenger p) {
        pList[i]=p;
        i++;
    }

    public void printList() {
        for (int i = 0; i < pList.length; i++) {
            System.out.printf("%s %s Baggage Charge:€%.2f%n", pList[i].getName(),
                    pList[i].getAge(), pList[i].calcBaggageCharge());
        }
    }

    public int checkAvailability() {
        int seatsTaken = pList.length;
        int remainder;

        remainder = capacity - seatsTaken;

        return remainder;
    }

    public String calcOldestPassenger() {
        int max = 0;
        String name = null;
        for (int i = 0; i < pList.length; i++) {
            if (pList[i].getAge() > max) {
                max = pList[i].getAge();
                name = pList[i].getName();
            }
        }
        return "Oldest Person on the flight is:" + name + " age:" + max;

    }
}
