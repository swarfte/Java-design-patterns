package facadePattern;

public class TheaterLights {
    public void on() {
        System.out.println("Theater lights are on");
    }

    public void off() {
        System.out.println("Theater lights are off");
    }

    public void dim(int level) {
        System.out.println("Theater lights are dimming to " + level + "%");
    }

    @Override
    public String toString() {
        return "Theater lights";
    }
}
