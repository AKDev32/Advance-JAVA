package Abstraction.Example3;

public class Client {
    public static void main(String[] args) {
        Payment payment;
        payment = new CreditCard();
        payment.processPayment(2300);
    }
}
