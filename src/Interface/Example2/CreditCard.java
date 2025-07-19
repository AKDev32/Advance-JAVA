package Interface.Example2;

public class CreditCard implements PaymentProcessor{

    private String cardNumber;

    public CreditCard (String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
//        Logic for processing credit card payment
        System.out.println("Processing credit card payment of  $" + amount + " for card Number: " + cardNumber);
    }

    @Override
    public void refund(double amount) {
//        Logic for refunding credit card Payment
        System.out.println("Refunding $" + amount + " to credit card " + cardNumber);
    }

    @Override
    public String generateReceipt() {
//        Logic for generating receipt for credit card
        return "Receipt for the credit payment to card " + cardNumber;
    }
}
