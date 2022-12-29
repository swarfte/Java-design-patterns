package commandPattern;

public interface Command {
    public void execute(); // the execute method used to trigger the reference object's method

    public void undo(); // the undo method used to undo the execute method
}
