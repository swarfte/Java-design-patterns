package modelViewControllerPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HeartModel implements HeartModelInterface, Runnable{
    List<BeatObserver> beatObservers = new ArrayList<>();
    List<BPMObserver> bpmObservers = new ArrayList<>();
    int time = 1000;
    int bpm = 90;
    Random random = new Random(System.currentTimeMillis());
    Thread thread;

    public HeartModel(){
        thread = new Thread(this);
        thread.start();
    }

    public void run(){
        int lastRate = -1;
        while (true){
            int change = random.nextInt(10);
            if (random.nextInt(2) == 0){
                change = -change;
            }
            int rate = 60000 / (time + change);
            if (rate < 120 && rate > 50){
                time += change;
                notifyBeatObservers();
                if (rate != lastRate){
                    lastRate = rate;
                    notifyBPMObservers();
                }
            }
            try {
                Thread.sleep(time);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int getHeartRate() {
        return 60000 / time;
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        int i = beatObservers.indexOf(o);
        if (i >= 0){
            beatObservers.remove(i);
        }
    }

    public void notifyBeatObservers() {
        for (BeatObserver observer : beatObservers) {
            observer.updateBeat();
        }
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        int i = bpmObservers.indexOf(o);
        if (i >= 0){
            bpmObservers.remove(i);
        }
    }

    public void notifyBPMObservers(){
        for (BPMObserver observer : bpmObservers) {
            observer.updateBPM();
        }
    }
}
