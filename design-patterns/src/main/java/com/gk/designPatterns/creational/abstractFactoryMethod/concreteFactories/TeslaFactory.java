package main.java.com.gk.designPatterns.creational.abstractFactoryMethod.concreteFactories;

import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.abstractFactory.VehicleFactory;
import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.abstractProducts.Bike;
import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.abstractProducts.Car;
import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.concreteProducts.TeslaCar;

/**
 * Concrete Factory implements the abstract factory interface to create specific products for a
 * particular family.
 */
public class TeslaFactory implements VehicleFactory {
    @Override
    public Bike createBike() {
        return null;
    }

    @Override
    public Car createCar() {
        return new TeslaCar();
    }
}
