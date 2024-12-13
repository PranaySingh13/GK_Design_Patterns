package main.java.com.gk.designPatterns.creational.abstractFactoryMethod;

import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.abstractFactory.VehicleFactory;
import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.abstractProducts.Bike;
import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.abstractProducts.Car;
import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.concreteFactories.HondaFactory;
import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.concreteFactories.TeslaFactory;
import main.java.com.gk.designPatterns.creational.abstractFactoryMethod.concreteFactories.YamahaFactory;

/**
 * Abstract Factory Method Design Pattern
 * It's mostly similar to Factory method design pattern.
 * It must be used when we have families of related objects to manage and must be used together.
 */
public class AbstractFactoryMethodRealTimeExample {
    public static void main(String[] args) {

        /**
         * Consider a car showroom scenario
         * A factory for creating both Car and Bike for different brands like Honda or Tesla.
         * Focus: Multiple product hierarchies (e.g., vehicles of different brands).
         */

        System.out.println("What the customer needs ?");
        buyVehicle(4, 8500000);
        buyVehicle(2, 200000);

        System.out.println("Customer: Don't we have tesla bike ?");
        VehicleFactory teslaFactory = new TeslaFactory();
        Bike teslaBike = teslaFactory.createBike();
        if (teslaBike == null) {
            System.out.println("Tesla didn't created bike yet.");
        }
    }

    public static void buyVehicle(int wheelers, int budget) {
        switch (wheelers) {
            case 2 -> {
                if (budget > 100000) {
                    System.out.println("Above one lakhs ruppees we have");
                    VehicleFactory hondaFactory = new HondaFactory();
                    Bike hondaBike = hondaFactory.createBike();
                    hondaBike.assemble();
                } else {
                    System.out.println("under one lakhs ruppees we have");
                    VehicleFactory yamahaFactory = new YamahaFactory();
                    Bike yamahaBike = yamahaFactory.createBike();
                    yamahaBike.assemble();
                }
            }
            case 4 -> {
                if (budget > 5000000) {
                    System.out.println("Above 50 Lakhs we have");
                    VehicleFactory teslaFactory = new TeslaFactory();
                    Car teslaCar = teslaFactory.createCar();
                    teslaCar.assemble();
                } else {
                    System.out.println("Under 50 Lakhs we have");
                    VehicleFactory hondaFactory = new HondaFactory();
                    Car hondaCar = hondaFactory.createCar();
                    hondaCar.assemble();
                }
            }
            default -> System.out.println("We deals with 2 or 4 wheelers vehicles only.");
        }
    }
}
