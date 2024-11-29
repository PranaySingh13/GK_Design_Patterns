package main.java.com.gk.designPatterns.creational.singleton.doubleCheckedLocking;

public class DoubleCheckedLockingSingletonExample {
    public static void main(String[] args) {

        /**
         * Without volatile instance
         */
        Thread t1 = new Thread(() -> {
            Singleton1 singleton1 = Singleton1.getInstance();
            System.out.println(singleton1);
            System.out.println(singleton1.getValue());
        });

        Thread t2 = new Thread(() -> {
            Singleton1 singleton2 = Singleton1.getInstance();
            System.out.println(singleton2);
            System.out.println(singleton2.getValue());
        });

        t1.start();
        t2.start();

        //null
        //Initialized

        /**
         * With volatile instance
         */
        Thread t3 = new Thread(() -> {
            Singleton2 singleton1 = Singleton2.getInstance();
            System.out.println(singleton1);
            System.out.println(singleton1.getValue());
        });

        Thread t4 = new Thread(() -> {
            Singleton2 singleton2 = Singleton2.getInstance();
            System.out.println(singleton2);
            System.out.println(singleton2.getValue());
        });

        t3.start();
        t4.start();
        //Initialized
        //Initialized
    }
}
