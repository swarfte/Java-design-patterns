package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable{
    List<Quackable> quackers = new ArrayList<>();
    Observable observable;

    public Flock() {
        observable = new Observable(this);
    }

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (Quackable quacker : quackers) {
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quacker : quackers) {
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        // it is because the quack() method will call notifyObservers() for each quacker
    }

    @Override
    public String toString() {
        return "Flock of Ducks";
    }

}
