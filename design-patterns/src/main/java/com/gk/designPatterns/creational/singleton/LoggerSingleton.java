package main.java.com.gk.designPatterns.creational.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LoggerSingleton {

    private static volatile LoggerSingleton instance;
    private PrintWriter writer;

    private LoggerSingleton() {
        try {
            writer = new PrintWriter(new FileWriter("application.text", true), true);
        } catch (IOException e) {
            throw new RuntimeException("Failed to initialize logger", e);
        }
    }

    public static LoggerSingleton getInstance() {
        if (instance == null) {
            synchronized (LoggerSingleton.class) {
                if (instance == null) {
                    instance = new LoggerSingleton();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        writer.println(message);
    }
}
