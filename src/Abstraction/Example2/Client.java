package Abstraction.Example2;

public class Client {
    public static void main(String[] args) {
        Payment payment;
        payment = new CreditCard();
        payment.processPayment(1500);

        payment = new DebitCardPayment();
        payment.processPayment(800);

        payment = new UPIPayment();
        payment.processPayment(1200);

    }
}
