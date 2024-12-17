package main.java.com.gk.designPatterns.creational.builder;

public class Pizza {
    private String size;
    private String crust;
    private String toppings;
    private String extraCheese;

    // Private constructor
    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.toppings = builder.toppings;
        this.extraCheese = builder.extraCheese;
    }

    public static class PizzaBuilder {
        private String size;
        private String crust;
        private String toppings;
        private String extraCheese;


        // Constructor with mandatory field
        public PizzaBuilder(String size) {
            this.size = size;
        }

        // Builder methods for optional fields
        public PizzaBuilder crust(String crust) {
            this.crust = crust;
            return this;
        }

        public PizzaBuilder toppings(String toppings) {
            this.toppings = toppings;
            return this;
        }

        public PizzaBuilder extraCheese(String extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        // Build method
        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size + ", crust=" + crust +
                ", toppings=" + toppings + ", extraCheese=" + extraCheese + "]";
    }

}
