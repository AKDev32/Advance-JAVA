package Interface.Example2;

public interface PaymentProcessor {
    void pay (double amount);
    void refund (double amount);
    String generateReceipt ();
}
