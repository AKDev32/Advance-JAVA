package Abstraction;

public class OnlineStore {

    public static void main(String[] args) {
        Product electronics = new Electronics("Smartphone", 50000);
        Product clothing = new Electronics("T-Shirt", 500);

        System.out.println(electronics.calculateTax());
        System.out.println(clothing.calculateShippingCost());

    }
}
