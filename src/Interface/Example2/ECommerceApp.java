package Interface.Example2;

public class ECommerceApp {
    public static void main(String[] args) {
        PaymentProcessor creditCard = new CreditCard("1234567890");
        PaymentProcessor paypal = new CreditCard("user@gmail.com");
        PaymentProcessor bankTransfer = new CreditCard("9876543210");

//        Process payments
        creditCard.pay(500);
        paypal.pay(400);
        bankTransfer.pay(500);

//        Refund payments
        creditCard.refund(50);
        paypal.refund(200);
        bankTransfer.refund(50);

//        Generate receipts
        System.out.println(creditCard.generateReceipt());
        System.out.println(paypal.generateReceipt());
        System.out.println(bankTransfer.generateReceipt());
    }
}
