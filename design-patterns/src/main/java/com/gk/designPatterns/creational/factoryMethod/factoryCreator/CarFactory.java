package main.java.com.gk.designPatterns.creational.factoryMethod.factoryCreator;

import main.java.com.gk.designPatterns.creational.factoryMethod.product.Car;
import main.java.com.gk.designPatterns.creational.factoryMethod.product.Vehicle;

/**
 * Concrete Creator (Subclass): Implements the factory method to return a specific product.
 */
public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
