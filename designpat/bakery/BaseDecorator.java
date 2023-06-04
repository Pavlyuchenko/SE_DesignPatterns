/**
 * Group 29
 * Michal Pavlíček i6306065
 * Luuk Dobbelaar i6331749
 */

package designpat.bakery;

public abstract class BaseDecorator {
    public abstract String effect(String text);

    public abstract int getPriceIncrease();
}