/**
 * Group 29
 * Michal Pavlíček i6306065
 * Luuk Dobbelaar i6331749
 */
package designpat.bakery;

public class SayingDecorator extends BaseDecorator {
    public int PRICE_INCREASE = 0;
    private String saying;

    public SayingDecorator(String text) {
        this.saying = text;
    }

    public String effect(String text) {
        return text + " with saying \"" + this.saying + "\"";
    }

    public int getPriceIncrease() {
        return PRICE_INCREASE;
    }
}