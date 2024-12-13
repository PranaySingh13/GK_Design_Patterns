package main.java.com.gk.designPatterns.creational.factoryMethod.abstractFactory;

import main.java.com.gk.designPatterns.creational.factoryMethod.abstractProduct.Vehicle;

/**
 * Creator (Abstract Class): Declares the factory method that returns objects of a Product type.
 */
public interface VehicleFactory {
    Vehicle createVehicle();
}
