package main.java.com.gk.designPatterns.creational.singleton.eagerInitialization;

public class EagerInitializationSingletonExample {
    public static void main(String[] args) {

        MySingleton.doSomething();

        //It is thread safe.
        // JVM executes a static initializer when the class is loaded and
        // hence this is guaranteed to be thread-safe.
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " got instance: " + MySingleton.getInstance().hashCode());
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");
        t1.start();
        t2.start();
        t3.start();
    }
}
