package modelViewControllerPattern;

public interface BeatModelInterface {

    // The following 4 methods is the controller method
    void initialize();

    void on();

    void off();

    void setBPM(int bpm);

    // the following method is used to return the current BPM

    int getBPM();

    // these following method allow view and controller to register themselves as observers to get the state
    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);
}
