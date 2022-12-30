package facadePattern;

public class PopcornPopper {
    public void on() {
        System.out.println("Popcorn popper is on");
    }

    public void off() {
        System.out.println("Popcorn popper is off");
    }

    public void pop() {
        System.out.println("Popcorn popper is popping popcorn");
    }

    @Override
    public String toString() {
        return "Popcorn popper";
    }
}
