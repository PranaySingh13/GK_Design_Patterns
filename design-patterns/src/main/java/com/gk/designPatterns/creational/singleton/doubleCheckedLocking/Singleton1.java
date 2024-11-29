package main.java.com.gk.designPatterns.creational.singleton.doubleCheckedLocking;

// Double-Checked Locking Singleton
public class Singleton1 {

    // Non volatile instance
    private static Singleton1 instance;
    private String value;

    // Private constructor to prevent instantiation
    private Singleton1() {
        try {
            Thread.sleep(100); // Simulate some initialization delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        value = "Initialized";
    }

    // Public method to provide access to the instance
    public static Singleton1 getInstance() {
        // First check: avoids unnecessary synchronization
        if (instance == null) {

            synchronized (Singleton1.class) {
                // Second check: ensures instance is still null
                if (instance == null) {
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}
