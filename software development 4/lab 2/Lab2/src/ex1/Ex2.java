package ex1;

public class Ex2 {
    public static void main(String[] args) {
        int dublinPop=1000000;
        int meathPop=50000;
        int leitrimPop=10000;

        dublinPop=dublinPop+leitrimPop;
        leitrimPop=0;
        System.out.println("The population of Dublin is: " + dublinPop);
        System.out.println("The population of Leitrim is: " + leitrimPop);
    }
}
