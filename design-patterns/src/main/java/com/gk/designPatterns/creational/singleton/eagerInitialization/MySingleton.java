package main.java.com.gk.designPatterns.creational.singleton.eagerInitialization;

/**
 * Eager Initialization Singleton via static initializer
 */
public class MySingleton {
    private static MySingleton instance = new MySingleton();

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        return instance;
    }

    public static void doSomething() {
        System.out.println("Eager Work Done");
    }
}
