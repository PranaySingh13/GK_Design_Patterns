package main.java.com.gk.designPatterns.creational.singleton.lazyInitialization;

public class LazyInitializationSingletonExample {
    public static void main(String[] args) {

        /**
         * Singleton obj is not created until we need it and call the getInstance() method.
         * This is called lazy instantiation.
         */

        /**
         * Here, we see private contructor is called and same hash code
         * for both instances as it creates a new instance (if none exists)
         * or returns the existing instance to the caller.
         */
        System.out.println(MySingleton.getInstance().hashCode());
        MySingleton.getInstance();
        System.out.println(MySingleton.getInstance().hashCode());
        MySingleton.doSomething();

        //It is not thread safe.
        // Create multiple threads trying to access the Singleton instance
        Runnable task = () -> {
            MySingleton singleton = MySingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " got instance: " + singleton.hashCode());
        };

        /**
         * Multiple threads access the getInstance() method simultaneously.
         * Two or more threads might find instance == null at the same time and create separate instances.
         * This violates the Singleton pattern, which mandates that only one instance should exist.
         */
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");
        t1.start();
        t2.start();
        t3.start();
    }
}
