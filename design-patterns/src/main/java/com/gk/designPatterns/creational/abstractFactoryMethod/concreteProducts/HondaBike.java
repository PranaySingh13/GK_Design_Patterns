package main.java.com.gk.designPatterns.creational.abstractFactoryMethod.concreteProducts;

import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.abstractProducts.Bike;

/**
 * Concrete Products implements the abstract product interface for specific family.
 */
public class HondaBike implements Bike {
    @Override
    public void assemble() {
        System.out.println("Honda Bike Assembled.");
    }
}
