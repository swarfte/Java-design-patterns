package commandPattern;

public class TV {
    String location = "";

    public TV(){

    }

    public TV(String location) {
        this.location = location;
    }
    public void on() {
        System.out.println(location + "TV is on");
    }

    public void off() {
        System.out.println(location + "TV is off");
    }
}
