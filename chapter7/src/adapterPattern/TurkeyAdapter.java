package adapterPattern;

public class TurkeyAdapter implements Duck {
    Turkey turkey; // The adapter holds a reference to the object it adapts

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() { // The adapter translates the interface of the object it adapts
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
