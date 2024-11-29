package main.java.com.gk.designPatterns.creational.singleton;

public class SingletonRealtimeExample {
    public static void main(String[] args) {
        LoggerSingleton logger = LoggerSingleton.getInstance();

        // Log some messages
        logger.log("Application started");
        logger.log("Performing some operations...");

        try {
            int result = 10 / 0; // This will cause an exception
        } catch (Exception e) {
            logger.log("Error occurred: " + e.getStackTrace());
        }

        logger.log("Application shutting down");
    }
}
