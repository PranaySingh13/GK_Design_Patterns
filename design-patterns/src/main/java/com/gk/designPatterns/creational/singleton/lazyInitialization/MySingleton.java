package main.java.com.gk.designPatterns.creational.singleton.lazyInitialization;

/**
 * Lazy Initialization Singleton
 */
public class MySingleton {

    // Static member to hold the single instance
    private static MySingleton instance;

    // Private constructor to prevent external instantiation
    private MySingleton() {
        System.out.println("Singleton is instantiated");
    }

    // Static factory method for global access
    public static MySingleton getInstance() {

        // Check if an instance exists
        if (instance == null) {
            // If no instance exists, create one
            instance = new MySingleton();
        }
        // Return the existing instance
        return instance;
    }

    public static void doSomething() {
        System.out.println("Work is done");
    }
}
