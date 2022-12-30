package facadePattern;

public class Projector {
    public void on() {
        System.out.println("Projector is on");
    }

    public void off() {
        System.out.println("Projector is off");
    }

    public void wideScreenMode() {
        System.out.println("Projector is in widescreen mode");
    }

    public void tvMode() {
        System.out.println("Projector is in TV mode");
    }

    @Override
    public String toString() {
        return "Projector";
    }
}
