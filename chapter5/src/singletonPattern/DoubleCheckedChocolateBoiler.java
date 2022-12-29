package singletonPattern;

public class DoubleCheckedChocolateBoiler {
    protected volatile static DoubleCheckedChocolateBoiler uniqueInstance;

    private DoubleCheckedChocolateBoiler() {
    }

    public static DoubleCheckedChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckedChocolateBoiler.class) { // the critical section
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }

    // other useful methods here
}
