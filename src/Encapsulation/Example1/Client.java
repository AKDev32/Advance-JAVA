package Encapsulation.Example1;

public class Client {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Aman Kumar");
        emp.setSalary(23434343);

        System.out.println("Employee name is " + emp.getName());
        System.out.println("Employee salary is " + emp.getSalary());

        Voter voter = new Voter();
        voter.setName("Aman Kumar");
        voter.setAge(20);

        System.out.println("Voter name is " + voter.getName());
        System.out.println("Voter age is " + voter.getAge());

        BankAccount account = new BankAccount("1234567890", 10000);
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Current Balance : " + account.getBalance());

        account.deposit(500);
        System.out.println("Balance after deposit : "  + account.getBalance());

        account.withdraw(300);
        System.out.println("Balance after withdrawal : " + account.getBalance());
    }
}
