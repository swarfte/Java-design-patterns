package facadePattern;

public class Screen {
    public void up() {
        System.out.println("Screen is up");
    }

    public void down() {
        System.out.println("Screen is down");
    }

    @Override
    public String toString() {
        return "Screen";
    }
}
