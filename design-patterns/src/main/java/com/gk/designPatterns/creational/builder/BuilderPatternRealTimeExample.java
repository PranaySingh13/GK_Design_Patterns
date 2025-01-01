package main.java.com.gk.designPatterns.creational.builder;

/**
 * Builder Design Pattern allows us to construct different representations of the object
 * step by step using the same construction process.
 */
public class BuilderPatternRealTimeExample {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza.PizzaBuilder("Large")
                .crust("Thin Crust")
                .toppings("Mushroom")
                .extraCheese("True")
                .build();
        System.out.println("Pizza 1: " + pizza1.toString());
        Pizza pizza2 = new Pizza.PizzaBuilder("Medium")
                .crust("Thick Crust")
                .toppings("Black olives")
                .extraCheese("False")
                .build();
        System.out.println("Pizza 2: " + pizza2.toString());
        Pizza pizza3 = new Pizza.PizzaBuilder("Small")
                .crust("Thin Crust")
                .build();
        System.out.println("Pizza 3: " + pizza3.toString());


        /**
         * The Director class decides how to construct different types of Pizza.
         */
        String size = "Large";
        if ("Large".equalsIgnoreCase(size)) {
            Pizza.PizzaBuilder pizzaBuilder = new Pizza.PizzaBuilder(size);
            PizzaDirector pizzaDirector = new PizzaDirector(pizzaBuilder);
            Pizza largePizza = pizzaDirector.orderLargePizza(size);
            System.out.println(largePizza);
        } else {
            Pizza.PizzaBuilder pizzaBuilder = new Pizza.PizzaBuilder("small");
            PizzaDirector pizzaDirector = new PizzaDirector(pizzaBuilder);
            Pizza mediumPizza = pizzaDirector.orderMediumPizza("small");
            System.out.println(mediumPizza);
        }

    }
}
