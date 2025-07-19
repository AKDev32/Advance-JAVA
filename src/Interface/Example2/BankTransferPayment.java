package Interface.Example2;

import Encapsulation.BankAccount;

public class BankTransferPayment implements PaymentProcessor{

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
