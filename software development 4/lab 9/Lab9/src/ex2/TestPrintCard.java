package ex2;

public class TestPrintCard {
    public static void main(String[] args) {
        PrintCard card1 = new PrintCard();
        card1.setAccountNumber("12345");
        card1.setPassword("guess");
        card1.setNumberCredits(100);

        card1.print();
    }
}
