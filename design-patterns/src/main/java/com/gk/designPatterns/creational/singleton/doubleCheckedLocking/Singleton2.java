package main.java.com.gk.designPatterns.creational.singleton.doubleCheckedLocking;

//Correct Double-Checked Locking Singleton
public class Singleton2 {

    //volatile instance
    private static volatile Singleton2 instance;
    private String value;

    // Private constructor to prevent instantiation
    private Singleton2() {
        try {
            Thread.sleep(100); // Simulate some initialization delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        value = "Initialized";
    }

    // Public method to provide access to the instance
    public static Singleton2 getInstance() {
        // First check: avoids unnecessary synchronization
        if (instance == null) {

            synchronized (Singleton2.class) {
                // Second check: ensures instance is still null
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}