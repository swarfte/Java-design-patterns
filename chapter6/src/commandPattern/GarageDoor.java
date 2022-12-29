package commandPattern;

public class GarageDoor {

    String location = "";

    public GarageDoor() {
    }

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println("Garage door is open");
    }

    public void down() {
        System.out.println(location + "Garage door is closed");
    }

    public void stop() {
        System.out.println(location + "Garage door is stopped");
    }

    public void lightOn() {
        System.out.println(location + "Garage light is on");
    }

    public void lightOff() {
        System.out.println(location + "Garage light is off");
    }
}
