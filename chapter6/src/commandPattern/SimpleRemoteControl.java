package commandPattern;

public class SimpleRemoteControl {
    Command slot; // the common interface for all commands

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
