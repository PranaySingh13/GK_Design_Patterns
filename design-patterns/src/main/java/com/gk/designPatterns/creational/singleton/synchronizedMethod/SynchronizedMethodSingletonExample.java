package main.java.com.gk.designPatterns.creational.singleton.synchronizedMethod;

public class SynchronizedMethodSingletonExample {

    public static void main(String[] args) {

        /**
         * Only one thread can execute at a time via synchronized getInstance() method.
         */
        Runnable task = () -> {
            MySingleton singleton = MySingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " got instance: " + singleton.hashCode());
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");
        t1.start();
        t2.start();
        t3.start();
    }
}
