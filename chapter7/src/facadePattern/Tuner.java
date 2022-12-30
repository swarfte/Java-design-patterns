package facadePattern;

public class Tuner {

    StreamingPlayer streamingPlayer;

    Amplifier amplifier;
    public void on() {
        System.out.println("Tuner is on");
    }

    public void off() {
        System.out.println("Tuner is off");
    }

    public void setAm() {
        System.out.println("Tuner is set for AM");
    }

    public void setFm() {
        System.out.println("Tuner is set for FM");
    }

    public void setFrequency(double frequency) {
        System.out.println("Tuner is set for frequency " + frequency);
    }

    @Override
    public String toString() {
        return "Tuner";
    }
}
