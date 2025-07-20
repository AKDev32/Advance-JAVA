package Abstraction.Example4;

public class CreditCard extends Payment {

    // Abstract subclass that provides the shared implementation
    @Override
    void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " through a card");
    }
}
