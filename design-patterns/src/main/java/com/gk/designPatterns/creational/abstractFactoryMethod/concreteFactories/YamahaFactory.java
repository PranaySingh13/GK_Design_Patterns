package main.java.com.gk.designPatterns.creational.abstractFactoryMethod.concreteFactories;

import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.abstractFactory.VehicleFactory;
import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.abstractProducts.Bike;
import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.abstractProducts.Car;
import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.concreteProducts.YamahaBike;

/**
 * Concrete Factory implements the abstract factory interface to create specific products for a
 * particular family.
 */
public class YamahaFactory implements VehicleFactory {
    @Override
    public Bike createBike() {
        return new YamahaBike();
    }

    @Override
    public Car createCar() {
        return null;
    }
}
