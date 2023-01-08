package remoteProxyPattern;

public class WinnerState implements State{
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() { // the winner state doesn't care about the quarter
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() { // the winner state doesn't care about the quarter
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() { // the winner state doesn't care about the quarter
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
        gumballMachine.releaseBall(); // get the first gumball
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall(); // get the second gumball
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public String toString() {
        return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
    }
}
