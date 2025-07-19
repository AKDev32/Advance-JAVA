package Inheritance.Example2;

public class Main {

    public static void main(String[] args) {
        SamSung samSung = new SamSung();
        Nokia nokia = new Nokia();
        Xiaomi xiaomi = new Xiaomi();

        samSung.setCost(30000);
        samSung.setColor("Black");
        samSung.setRAM("4GB");
        samSung.setAndroid_version("Android Pie");

        nokia.setColor("White");
        nokia.setCost(2500);
        nokia.setRAM("2GB");

        xiaomi.setColor("Red");
        xiaomi.setCost(18000);
        xiaomi.setRAM("6GB");

        System.out.println("Samsung Mobile Details...");
        System.out.println("The cost is : " + samSung.getCost());
        System.out.println("The color is : " + samSung.getColor());
        System.out.println("The RAM is : " + samSung.getRAM());

        System.out.println("Nokia Mobile Details...");
        System.out.println("The cost is : " + nokia.getCost());
        System.out.println("The color is : " + nokia.getColor());
        System.out.println("The RAM is : " + nokia.getRAM());

        System.out.println("Xiaomi Mobile Details...");
        System.out.println("The cost is : " + xiaomi.getCost());
        System.out.println("The color is : " + xiaomi.getColor());
        System.out.println("The RAM is : " + xiaomi.getRAM());
    }
}
