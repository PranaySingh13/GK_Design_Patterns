package main.java.com.gk.designPatterns.creational.singleton.waysToBreakSingleton.cloning;

public class Singleton1 implements Cloneable {

    private static Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }

    /**
     * The clone() method in Java creates a new object by copying the fields of the existing object.
     * Breaks singleton property
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
