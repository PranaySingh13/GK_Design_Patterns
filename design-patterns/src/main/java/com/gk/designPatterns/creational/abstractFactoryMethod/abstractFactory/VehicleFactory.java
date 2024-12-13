package main.java.com.gk.designPatterns.creational.abstractFactoryMethod.abstractFactory;

import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.abstractProducts.Bike;
import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.abstractProducts.Car;

/**
 * Abstract Factory Defines methods to create abstract products which are of same family and must be used together.
 */
public interface VehicleFactory {
    Bike createBike();

    Car createCar();
}
