package main.java.com.gk.designPatterns.creational.builder;

/**
 * Director Class: It's optional but required when product is built in a predefined sequence or configuration
 * , Centralizes common construction logic, allowing reuse of predefined product configurations
 * and Simplification.
 */
public class PizzaDirector {
    private final Pizza.PizzaBuilder pizzaBuilder;

    public PizzaDirector(Pizza.PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza orderLargePizza(String size) {
        return new Pizza.PizzaBuilder(size)
                .crust("Thin Crust")
                .toppings("Mushroom")
                .extraCheese("True")
                .build();
    }

    public Pizza orderMediumPizza(String size) {
        return new Pizza.PizzaBuilder(size)
                .crust("Thick Crust")
                .toppings("Black olives")
                .extraCheese("False")
                .build();
    }
}
