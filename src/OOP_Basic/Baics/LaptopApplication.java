package OOP_Basic.Baics;

public class LaptopApplication {
    public static void main(String[] args) {
        Laptop laptopVersion1 = new Laptop(10, 7.5, 9);
        laptopVersion1.powerOn();
        laptopVersion1.bootOS(3);
        laptopVersion1.increaseBrightness();
        laptopVersion1.decreaseBrightness();
    }
}
