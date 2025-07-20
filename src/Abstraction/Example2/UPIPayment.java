package Abstraction.Example2;

public class UPIPayment extends Payment{
    @Override
    void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " through UPI");
    }
}
