package main.java.com.gk.designPatterns.creational.singleton.waysToBreakSingleton.serialization;

import java.io.Serializable;

public class MySingleton1 implements Serializable {
    private static MySingleton1 INSTANCE = new MySingleton1();

    private MySingleton1() {
    }

    public static MySingleton1 getInstance() {
        return INSTANCE;
    }
}
