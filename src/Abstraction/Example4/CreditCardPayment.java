package Abstraction.Example4;

// Concrete subclass that inherits implementation
public class CreditCardPayment extends CreditCard{
    // No need to override processPayment()
    void showCardType() {
        System.out.println("Credit Card selected");
    }
}
