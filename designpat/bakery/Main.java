/**
 * Group 29
 * Michal Pavlíček i6306065
 * Luuk Dobbelaar i6331749
 */
package designpat.bakery;

/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();

        Cake chocolate = new ChocolateCake();

        Cake vanillaPlain = new VanillaCake();

        // Adding the features is done by calling Cake.add(Decorator) function
        vanillaPlain.add(new SayingDecorator("PLAIN"));

        Cake vanillaSprinklesFancy = new VanillaCake();
        vanillaSprinklesFancy.add(new SprinklesDecorator());
        vanillaSprinklesFancy.add(new SayingDecorator("FANCY"));

        Cake multilayerStrawberry = new StrawberryCake();
        multilayerStrawberry.add(new MultiLayerDecorator());
        multilayerStrawberry.add(new SprinklesDecorator());
        multilayerStrawberry.add(new SprinklesDecorator());
        multilayerStrawberry.add(new SayingDecorator("One of"));
        multilayerStrawberry.add(new SayingDecorator("EVERYTHING"));

        order.addCake(chocolate);
        order.addCake(vanillaPlain);
        order.addCake(vanillaSprinklesFancy);
        order.addCake(multilayerStrawberry);

        // Print the order
        order.printOrder();
    }
}
