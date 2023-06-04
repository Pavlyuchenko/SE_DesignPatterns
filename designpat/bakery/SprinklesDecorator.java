/**
 * Group 29
 * Michal Pavlíček i6306065
 * Luuk Dobbelaar i6331749
 */
package designpat.bakery;

public class SprinklesDecorator extends BaseDecorator {
    public int PRICE_INCREASE = 2;

    public String effect(String text) {
        return text + " with sprinkles";
    }

    public int getPriceIncrease() {
        return PRICE_INCREASE;
    }
}