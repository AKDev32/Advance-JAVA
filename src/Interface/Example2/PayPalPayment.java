package Interface.Example2;

public class PayPalPayment implements PaymentProcessor{

    private String email;

    public PayPalPayment (String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        // Logic for processing PayPal payment
        System.out.println("Processing PayPal payment of $" + amount + " for email " + email);
    }

    @Override
    public void refund(double amount) {
        // Logic for refunding PayPal payment
        System.out.println("Refunding $" + amount + " to PayPal account " + email);
    }

    @Override
    public String generateReceipt() {
        // Logic for generating receipt
        return "Receipt for PayPal payment to account " + email;
    }
}
