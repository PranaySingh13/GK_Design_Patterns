package main.java.com.gk.designPatterns.creational.abstractFactoryMethod.concreteProducts;

import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.abstractProducts.Car;

/**
 * Concrete Products implements the abstract product interface for specific family.
 */
public class HondaCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Honda Car Assembled.");
    }
}
