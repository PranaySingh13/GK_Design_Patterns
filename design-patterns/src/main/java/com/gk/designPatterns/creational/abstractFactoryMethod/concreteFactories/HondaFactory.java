package main.java.com.gk.designPatterns.creational.abstractFactoryMethod.concreteFactories;

import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.abstractFactory.VehicleFactory;
import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.abstractProducts.Bike;
import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.abstractProducts.Car;
import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.concreteProducts.HondaBike;
import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.concreteProducts.HondaCar;

/**
 * Concrete Factory implements the abstract factory interface to create specific products for a
 * particular family.
 */
public class HondaFactory implements VehicleFactory {
    @Override
    public Bike createBike() {
        return new HondaBike();
    }

    @Override
    public Car createCar() {
        return new HondaCar();
    }
}
