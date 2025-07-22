package OOP_Basic.Baics;

public class Laptop {

    double height;
    double width;
    double screenSize;
    int maxBrightnessLevel;
    int brightnessLevel;
    boolean power;

    public Laptop (double height, double width, double screenSize) {
        this.height = height;
        this.width = width;
        this.screenSize = screenSize;
    }

    String bootOS (int os) {
        switch (os) {
            case 1 : return "window";
            case 2 : return "linux";
            case 3 : return "ubuntu";
            case 4 : return "mac";
            default : return "window";
        }
    }

    void powerOn () {
        this.power = true;
    }

    void powerOff () {
        this.power = false;
    }

    int increaseBrightness () {
        if (maxBrightnessLevel > brightnessLevel) brightnessLevel++;
        return brightnessLevel;
    }

    int decreaseBrightness () {
        if (0 < brightnessLevel) brightnessLevel--;
        return brightnessLevel;
    }
}
