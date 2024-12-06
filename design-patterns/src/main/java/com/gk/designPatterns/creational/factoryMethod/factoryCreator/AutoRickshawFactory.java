package main.java.com.gk.designPatterns.creational.factoryMethod.factoryCreator;

import main.java.com.gk.designPatterns.creational.factoryMethod.product.AutoRickshaw;
import main.java.com.gk.designPatterns.creational.factoryMethod.product.Vehicle;

/**
 * Concrete Creator (Subclass): Implements the factory method to return a specific product.
 */
public class AutoRickshawFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new AutoRickshaw();
    }
}