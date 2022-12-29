package singletonPattern;

public class EnumChocolateBoiler {
    public enum Singleton{
        UNIQUE_INSTANCE;
    }

    public static Singleton getInstance() {
        return Singleton.UNIQUE_INSTANCE;
    }

    // other useful methods here
}
