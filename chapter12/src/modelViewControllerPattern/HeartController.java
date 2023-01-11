package modelViewControllerPattern;

public class HeartController implements ControllerInterface {
    HeartModelInterface model; // refer to the model
    DJView view; // refer to the view

    public HeartController(HeartModelInterface model){
        this.model = model;
        view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    @Override
    public void run(){
        // the heart model doesn't have an initialize method
    }

    @Override
    public void start() {
        // the heart model doesn't have an on method
    }

    @Override
    public void stop(){
        // the heart model doesn't have an off method
    }

    @Override
    public void increaseBPM(){
        // the heart model doesn't have a setBPM method
    }

    @Override
    public void decreaseBPM(){
        // the heart model doesn't have a setBPM method
    }

    @Override
    public void setBPM(int bpm){
        // the heart model doesn't have a setBPM method
    }
}
