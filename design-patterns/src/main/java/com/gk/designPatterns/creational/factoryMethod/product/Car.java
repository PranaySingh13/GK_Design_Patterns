package main.java.com.gk.designPatterns.creational.factoryMethod.product;

/**
 * Concrete Product (Subclass): Implements the Product interface.
 */
public class Car implements Vehicle {
    @Override
    public void bookRides(String userName) {
        System.out.println("Hi " + userName + ", Car is booked.");
    }
}
