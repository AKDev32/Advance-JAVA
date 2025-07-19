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

    public static class BankTransferPayment implements PaymentProcessor {

        private String bankAccount;

        public BankTransferPayment (String bankAccount) {
            this.bankAccount = bankAccount;
        }
        @Override
        public void pay(double amount) {
            // Logic for processing bank transfer payment
            System.out.println("Processing bank transfer payment of $" + amount + " for account " + bankAccount);
        }

        @Override
        public void refund(double amount) {
            // Logic for refunding bank transfer payment
            System.out.println("Refunding $" + amount + " to bank account " + bankAccount);
        }

        @Override
        public String generateReceipt() {
            // Logic for generating receipt
            return "Receipt for bank transfer payment to account " + bankAccount;
        }
    }
}
