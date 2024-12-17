package main.java.com.gk.designPatterns.creational.builder;

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
    }
}
