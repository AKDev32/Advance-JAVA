package OOP_Basic;

public class Main {

    private String name;

//    No Argument Constructor
    Main () {
        System.out.println("Constructor called");
        name = "Aman Kumar";
    }

//    Parameterized Constructor
    Main (String lang) {
        name = lang;
        System.out.println(name + " is a programming language");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("The name is " + obj.name);

        Main obj1 = new Main("C++");
    }

}


