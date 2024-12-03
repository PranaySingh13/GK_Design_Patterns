package main.java.com.gk.designPatterns.creational.singleton.waysToBreakSingleton.serialization;

import java.io.Serializable;

public class MySingleton2 implements Serializable {
    private static MySingleton2 INSTANCE = new MySingleton2();

    private MySingleton2() {
    }

    public static MySingleton2 getInstance() {
        return INSTANCE;
    }

    /**
     * To maintain the singleton property during deserialization, override the readResolve()
     * method in the singleton class. This method is called after deserialization and
     * ensures that the singleton instance is returned.
     */
    protected Object readResolve() {
        return INSTANCE;
    }

}