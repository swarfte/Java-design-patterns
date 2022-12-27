package observerPattern;

public interface Subject {
    public void registerObserver(Observer o); // register an observer
    public void removeObserver(Observer o); // remove an observer
    public void notifyObservers(); // notify all observers
}

