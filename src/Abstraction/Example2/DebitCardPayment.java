package Abstraction.Example2;

public class DebitCardPayment extends Payment{
    @Override
    void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " through Debit Card");
    }
}
