package Encapsulation;

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
    }
}
