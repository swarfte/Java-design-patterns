package statePattern;


// old version
//public class GumballMachine {
//    final static int SOLD_OUT = 0;
//    final static int NO_QUARTER = 1;
//    final static int HAS_QUARTER = 2;
//    final static int SOLD = 3;
//
//    int state = SOLD_OUT;
//    int count = 0;
//
//    public GumballMachine(int count) { // the count is the number of gumballs in the machine
//        this.count = count;
//        if (count > 0) {
//            state = NO_QUARTER;
//        }
//    }
//
//    public void insertQuarter() {
//        if (state == HAS_QUARTER) {
//            System.out.println("You can't insert another quarter");
//        } else if (state == NO_QUARTER) {
//            state = HAS_QUARTER;
//            System.out.println("You inserted a quarter");
//        } else if (state == SOLD_OUT) {
//            System.out.println("You can't insert a quarter, the machine is sold out");
//        } else if (state == SOLD) {
//            System.out.println("Please wait, we're already giving you a gumball");
//        }
//    }
//
//    public void ejectQuarter() {
//        if (state == HAS_QUARTER) {
//            System.out.println("Quarter returned");
//            state = NO_QUARTER;
//        } else if (state == NO_QUARTER) {
//            System.out.println("You haven't inserted a quarter");
//        } else if (state == SOLD) {
//            System.out.println("Sorry, you already turned the crank");
//        } else if (state == SOLD_OUT) {
//            System.out.println("You can't eject, you haven't inserted a quarter yet");
//        }
//    }
//
//    public void turnCrank() {
//        if (state == SOLD) {
//            System.out.println("Turning twice doesn't get you another gumball!");
//        } else if (state == NO_QUARTER) {
//            System.out.println("You turned but there's no quarter");
//        } else if (state == SOLD_OUT) {
//            System.out.println("You turned, but there are no gumballs");
//        } else if (state == HAS_QUARTER) {
//            System.out.println("You turned...");
//            state = SOLD;
//            dispense();
//        }
//    }
//
//    public void dispense() {
//        if (state == SOLD) {
//            System.out.println("A gumball comes rolling out the slot");
//            count = count - 1;
//            if (count == 0) {
//                System.out.println("Oops, out of gumballs!");
//                state = SOLD_OUT;
//            } else {
//                state = NO_QUARTER;
//            }
//        } else if (state == NO_QUARTER) {
//            System.out.println("You need to pay first");
//        } else if (state == SOLD_OUT) {
//            System.out.println("No gumball dispensed");
//        } else if (state == HAS_QUARTER) {
//            System.out.println("No gumball dispensed");
//        }
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder result = new StringBuilder();
//        result.append("\nMighty Gumball, Inc.");
//        result.append("\nJava-enabled Standing Gumball Model #2004");
//        result.append("\nInventory: ").append(count).append(" gumball");
//        if (count != 1) {
//            result.append("s");
//        }
//        result.append("\nMachine is ");
//        if (state == SOLD_OUT) {
//            result.append("sold out");
//        } else if (state == NO_QUARTER) {
//            result.append("waiting for quarter");
//        } else if (state == HAS_QUARTER) {
//            result.append("waiting for turn of crank");
//        } else if (state == SOLD) {
//            result.append("delivering a gumball");
//        }
//        result.append("\n");
//        return result.toString();
//    }
//}

// new version

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State winnerState;

    State state;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: ").append(count).append(" gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        result.append(state);
        result.append("\n");
        return result.toString();
    }

}