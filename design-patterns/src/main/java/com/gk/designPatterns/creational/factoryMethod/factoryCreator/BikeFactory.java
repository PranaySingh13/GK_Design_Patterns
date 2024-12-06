package main.java.com.gk.designPatterns.creational.factoryMethod.factoryCreator;

import main.java.com.gk.designPatterns.creational.factoryMethod.product.Bike;
import main.java.com.gk.designPatterns.creational.factoryMethod.product.Vehicle;

/**
 * Concrete Creator (Subclass): Implements the factory method to return a specific product.
 */
public class BikeFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
