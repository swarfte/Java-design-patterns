package commandPattern;

public class NoCommand implements Command {
    @Override
    public void execute() { // empty method
    }

    @Override
    public void undo() { // empty method
    }
}
