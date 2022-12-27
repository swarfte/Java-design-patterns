package strategyPattern;

public abstract class Duck {
    QuackBehavior quackBehavior; // to describe the behavior about quacking
    FlyBehavior flyBehavior; // to describe the behavior about flying

    public void performQuack() {
        quackBehavior.quack(); // implementation of quack() is delegated to the object referenced by quackBehavior
    }

    public void performFly() {
        flyBehavior.fly(); // implementation of fly() is delegated to the object referenced by flyBehavior
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");// all ducks can swim
    }

    public abstract void display(); // each subclass of strategyPattern.Duck must implement display()

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb; // dynamically change the behavior of a duck at runtime
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb; // dynamically change the behavior of a duck at runtime
    }
}