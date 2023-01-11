package modelViewControllerPattern;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.lang.Runnable;


public class BeatModel implements BeatModelInterface, Runnable{
    List<BeatObserver> beatObservers = new ArrayList<>();
    List<BPMObserver> bpmObservers = new ArrayList<>();

    File resource ;
    int bpm = 90;
    Thread thread;
    boolean stop = false;
    Clip clip;

    public BeatModel(){
        resource = new File("./chapter12/src/modelViewControllerPattern/clap.wav");
    }

    public BeatModel(String path){
        resource = new File(path);
    }

    @Override
    public void initialize() {
        try{
            clip =(Clip) AudioSystem.getLine(new Line.Info(Clip.class));
            clip.open(AudioSystem.getAudioInputStream(resource));
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    // set the beat thread
    @Override
    public void on(){
        bpm = 90;
        notifyBPMObservers();
        thread = new Thread(this);
        stop = false;
        thread.start();
    }

    // stop the beat thread
    @Override
    public void off(){
        stopBeat();
        stop = true;
    }


    // run the bead thread
    @Override
    public void run(){
        while (!stop){
            playBeat();
            notifyBeatObservers();
            try{
                Thread.sleep(60000/getBPM()); // BPM is used to set the beat
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }


    // set the BPM and notify the BPM observers which registered this model
    @Override
    public void setBPM(int bpm){
        this.bpm = bpm;
        notifyBPMObservers();
    }

    // to get the current bpm
    @Override
    public int getBPM(){
        return bpm;
    }


    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }


    public void notifyBeatObservers(){
        for (BeatObserver observer : beatObservers) {
            observer.updateBeat();
        }
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }


    public void notifyBPMObservers(){
        for (BPMObserver observer : bpmObservers) {
            observer.updateBPM();
        }
    }

    @Override
    public void removeObserver(BeatObserver o){
        int i = beatObservers.indexOf(o);
        if (i >= 0){
            beatObservers.remove(i);
        }
    }

    @Override
    public void removeObserver(BPMObserver o){
        int i = bpmObservers.indexOf(o);
        if (i >= 0){
            bpmObservers.remove(i);
        }
    }

    public void playBeat(){
        clip.setFramePosition(0);
        clip.start();
    }

    public void stopBeat(){
        clip.setFramePosition(0);
        clip.stop();
    }
}
