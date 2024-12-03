package main.java.com.gk.designPatterns.creational.singleton.waysToBreakSingleton.cloning;

public class Singleton2 implements Cloneable {
    private static Singleton2 INSTANCE = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

    /**
     * To prevent cloning from breaking the singleton property, override the clone() method
     * in the singleton class and throw a CloneNotSupportedException.
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton instance cannot be cloned");
    }
}
