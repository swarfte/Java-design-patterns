package facadePattern;

public class Amplifier {

    Tuner tuner;
    StreamingPlayer player;
    public void on() {
        System.out.println("Amplifier is on");
    }

    public void off() {
        System.out.println("Amplifier is off");
    }

    public void setStreamingPlayer(StreamingPlayer streamingPlayer) {
        System.out.println("Amplifier is set for streaming player");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier is set for surround sound");
    }

    public void setVolume(int level) {
        System.out.println("Amplifier is set for volume " + level);
    }

    public void setTuner(Tuner tuner) {
        System.out.println("Amplifier is set for tuner");
    }

    public void setStereoSound() {
        System.out.println("Amplifier is set for stereo sound");
    }

    @Override
    public String toString() {
        return "Amplifier";
    }
}
