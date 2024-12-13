package main.java.com.gk.designPatterns.creational.factoryMethod.concreteFactories;

import main.java.com.gk.designPatterns.creational.factoryMethod.abstractFactory.VehicleFactory;
import main.java.com.gk.designPatterns.creational.factoryMethod.concreteProducts.Car;
import main.java.com.gk.designPatterns.creational.factoryMethod.abstractProduct.Vehicle;

/**
 * Concrete Creator (Subclass): Implements the factory method to return a specific product.
 */
public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
