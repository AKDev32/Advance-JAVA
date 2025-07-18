package OOP_Basic;

public class Lamp {

    boolean isOn;

    void turnOn () {
        isOn = true;
        System.out.println("Light is turned on");
    }

    void turnOff () {
        isOn = false;
        System.out.println("Light is turned off");
    }
}
