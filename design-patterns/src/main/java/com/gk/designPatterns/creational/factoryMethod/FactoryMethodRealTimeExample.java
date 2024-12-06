package main.java.com.gk.designPatterns.creational.factoryMethod;

import main.java.com.gk.designPatterns.creational.factoryMethod.factoryCreator.AutoRickshawFactory;
import main.java.com.gk.designPatterns.creational.factoryMethod.factoryCreator.BikeFactory;
import main.java.com.gk.designPatterns.creational.factoryMethod.factoryCreator.CarFactory;
import main.java.com.gk.designPatterns.creational.factoryMethod.factoryCreator.VehicleFactory;
import main.java.com.gk.designPatterns.creational.factoryMethod.product.Vehicle;

/**
 * The Factory Method Pattern provides an interface for creating objects in a superclass,
 * but allows subclasses to alter the type of objects that will be created at runtime.
 */

public class FactoryMethodRealTimeExample {
    public static void main(String[] args) {

        /**
         * Booking Rides via ola based on no of people.
         */

        bookOlaRides("Pranay Singh", 3);
        //Hi Pranay Singh, Car is booked.
    }

    /**
     * The client code calls the factory method instead of directly creating an object.
     * The factory method is overridden in the subclasses to instantiate specific types of products.
     * This provides flexibility to introduce new product types without changing the existing code.
     * Adding a new Vehicle type (e.g., SUV's, Trucks ) requires only creating a new product class and factory.
     */

    public static void bookOlaRides(String userName, int noOfPeople) {
        switch (noOfPeople) {
            case 1 -> {
                VehicleFactory bikeFactory = new BikeFactory();
                Vehicle bike = bikeFactory.createVehicle();
                bike.bookRides(userName);
            }
            case 2 -> {
                VehicleFactory autoRickshawFactory = new AutoRickshawFactory();
                Vehicle autoRickshaw = autoRickshawFactory.createVehicle();
                autoRickshaw.bookRides(userName);
            }
            case 3 -> {
                VehicleFactory carFactory = new CarFactory();
                Vehicle car = carFactory.createVehicle();
                car.bookRides(userName);
            }
            default -> System.out.println("Invalid number of users. No rides to book.");
        }
    }
}
