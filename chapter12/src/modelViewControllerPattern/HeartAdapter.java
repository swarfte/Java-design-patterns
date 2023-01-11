package modelViewControllerPattern;

public class HeartAdapter implements BeatModelInterface{
    HeartModelInterface heart;

    public HeartAdapter(HeartModelInterface heart){
        this.heart = heart;
    }

    @Override
    public void initialize() {
        // the heart model doesn't have an initialize method
    }

    @Override
    public void on() {
        // the heart model doesn't have an on method
    }

    @Override
    public void off() {
        // the heart model doesn't have an off method
    }

    @Override
    public int getBPM() {
        return heart.getHeartRate();
    }

    @Override
    public void setBPM(int bpm) {
        // the heart model doesn't have a setBPM method
    }

    @Override
    public void registerObserver(BeatObserver o) {
        heart.registerObserver(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        heart.removeObserver(o);
    }

    @Override
    public void registerObserver(BPMObserver o) {
        heart.registerObserver(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        heart.removeObserver(o);
    }
}
