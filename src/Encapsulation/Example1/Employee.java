package Encapsulation.Example1;

public class Employee {
    private String name;
    private String account;
    private int salary;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String account() {
        return account;
    }

    public void setAccount (String account) {
        this.account = account;
    }

    public Integer getSalary () {
        return salary;
    }

    public void setSalary (Integer salary) {
        this.salary = salary;
    }
}


// Fully Encapsulated class