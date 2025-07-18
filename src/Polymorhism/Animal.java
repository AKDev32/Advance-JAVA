package Polymorhism;

public class Animal {
    void makeSound () {
        System.out.println("Some Sound");
    }

    static class Dog extends Animal {
        void makeSound () {
            System.out.println("Barks");
        }
    }

    static class Cat extends Animal {
        void makeSound () {
            System.out.println("Meow");
        }
    }
}
