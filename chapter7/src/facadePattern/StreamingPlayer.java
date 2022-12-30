package facadePattern;

public class StreamingPlayer {

    Amplifier amplifier;
    public void on() {
        System.out.println("Streaming player is on");
    }

    public void off() {
        System.out.println("Streaming player is off");
    }

    public void play(String movie) {
        System.out.println("Streaming player is playing " + movie);
    }

    public void stop() {
        System.out.println("Streaming player is stopped");
    }

    public void pause() {
        System.out.println("Streaming player is paused");
    }

    public void setSurroundAudio() {
        System.out.println("Streaming player is set for surround audio");
    }

    public void setTwoChannelAudio() {
        System.out.println("Streaming player is set for two channel audio");
    }

    @Override
    public String toString() {
        return "Streaming player";
    }
}
