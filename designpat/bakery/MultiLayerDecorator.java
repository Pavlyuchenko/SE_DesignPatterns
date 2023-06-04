/**
 * Group 29
 * Michal Pavlíček i6306065
 * Luuk Dobbelaar i6331749
 */
package designpat.bakery;

public class MultiLayerDecorator extends BaseDecorator {
    private int PRICE_INCREASE = 5;

    public String effect(String text) {
        return "Multi-layered " + text;
    }

    public int getPriceIncrease() {
        return PRICE_INCREASE;
    }
}