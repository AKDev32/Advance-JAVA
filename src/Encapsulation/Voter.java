package Encapsulation;

public class Voter {

    private String name;
    private int age;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Age should be greater than 18");
        }
    }
}
