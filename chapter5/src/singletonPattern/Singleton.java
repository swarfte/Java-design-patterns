package singletonPattern;

public class Singleton {
    private static Singleton uniqueInstance;

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton(); // only one instance
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
