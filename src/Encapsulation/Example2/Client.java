package Encapsulation.Example2;

public class Client {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Aman Kumar", "abc@gmail.com", "asdfghjkl");
        System.out.println(customer.getCustomerId());
        System.out.println(customer.getName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getPassword());


    }
}
