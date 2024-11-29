package main.java.com.gk.designPatterns.creational.singleton.synchronizedMethod;

public class MySingleton {
    private static MySingleton instance;

    private MySingleton() {
    }

    // Only one thread can execute this at a time
    public static synchronized MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
}
