package main.java.com.gk.designPatterns.creational.singleton.waysToBreakSingleton.cloning;

public class Singleton3 implements Cloneable {
    private static Singleton3 INSTANCE = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return INSTANCE;
    }

    /**
     * If we don't want to rely on CloneNotSupportedException, we can also override
     * the clone() method to return the same instance.
     */
    @Override
    protected Object clone() {
        return INSTANCE;
    }
}
