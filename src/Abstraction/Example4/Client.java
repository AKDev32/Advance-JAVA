package Abstraction.Example4;

public class Client {
    public static void main(String[] args) {
        CreditCardPayment creditCard = new CreditCardPayment();
        creditCard.showCardType();
        creditCard.processPayment(1500);
    }
}
