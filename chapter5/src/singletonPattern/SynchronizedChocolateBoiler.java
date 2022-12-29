package singletonPattern;

public class SynchronizedChocolateBoiler {
    private static Singleton uniqueInstance;

    private SynchronizedChocolateBoiler() {
    }

    public static synchronized Singleton getInstance() { // synchronized the method
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton(); // only one instance
        }
        return uniqueInstance;
    }

    // other useful methods here
}
