package main.java.com.gk.designPatterns.creational.factoryMethod.concreteProducts;

import main.java.com.gk.designPatterns.creational.factoryMethod.abstractProduct.Vehicle;

/**
 * Concrete Product (Subclass): Implements the Product interface.
 */
public class AutoRickshaw implements Vehicle {
    @Override
    public void bookRides(String userName) {
        System.out.println("Hi " + userName + ", AutoRickshaw is booked.");
    }
}
