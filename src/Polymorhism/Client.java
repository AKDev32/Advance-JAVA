package Polymorhism;

public class Client {
    public static void main(String[] args) {
//        Calculator cal = new Calculator();
//        System.out.println(cal.add(3,5));
//        System.out.println(cal.add(6, 4,2, 2));
//        System.out.println(cal.add (23, 23, 23,3 ));
//        System.out.println( cal.add(2,3,4));


        System.out.println(Calculator.add(2, 4));
        System.out.println(Calculator.add(2, 4, 6));
        System.out.println(Calculator.add(2, 4, 6, 8));
    }
}
