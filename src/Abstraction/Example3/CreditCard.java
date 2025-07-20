package Abstraction.Example3;

public class CreditCard extends CardPayment{
    @Override
    void processPayment(double amount) {
        System.out.println("Credit card payment of ₹" + amount + " processed.");
    }
}
