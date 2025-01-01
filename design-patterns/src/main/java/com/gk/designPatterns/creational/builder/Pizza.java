package main.java.com.gk.designPatterns.creational.builder;

/**
 * Product Class: It contains all the fields that will be set through the builder.
 */
public class Pizza {
    private String size;
    private String crust;
    private String toppings;
    private String extraCheese;

    /**
     * Private constructor to ensure that object creation should be only via builder.
     */
    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.toppings = builder.toppings;
        this.extraCheese = builder.extraCheese;
    }

    /**
     * Nested Product Builder class which mirrors the properties of Product class.
     */
    public static class PizzaBuilder {
        private String size;
        private String crust;
        private String toppings;
        private String extraCheese;


        /**
         * Constructor with mandatory field
         */
        public PizzaBuilder(String size) {
            this.size = size;
        }

        /**
         * Builder methods for optional fields which allows setting values step by step.
         */
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

        /**
         * Build method will return an instance of product class.
         */
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
