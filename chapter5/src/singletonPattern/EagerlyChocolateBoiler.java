package singletonPattern;

public class EagerlyChocolateBoiler {
    private static EagerlyChocolateBoiler uniqueInstance = new EagerlyChocolateBoiler(); // instance created at load time

    private EagerlyChocolateBoiler() {
    }

    public static EagerlyChocolateBoiler getInstance() {
        return uniqueInstance;
    }

    // other useful methods here
}
