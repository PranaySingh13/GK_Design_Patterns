package main.java.com.gk.designPatterns.creational.singleton.innerClass;

public class MySingleton {

    private MySingleton() {
        System.out.println("Singleton instance created");
    }

    // Static inner helper class
    private static class MySingletonInner {
        // Inner class holds the Singleton instance
        private static final MySingleton instance = new MySingleton();
    }

    public static MySingleton getInstance() {
        return MySingletonInner.instance;
    }

    public void showMessage() {
        System.out.println("Singleton using Inner Static Class!");
    }
}
