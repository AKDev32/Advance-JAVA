package Abstraction.Example2;

public class CreditCard extends Payment{
    @Override
    void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " through Credit Card");
    }
}
