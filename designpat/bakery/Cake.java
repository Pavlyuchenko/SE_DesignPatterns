/**
 * Group 29
 * Michal Pavlíček i6306065
 * Luuk Dobbelaar i6331749
 */
package designpat.bakery;

/**
 * Cake bake class.
 */
public abstract class Cake {
    public int CAKE_COST = 10;
    private String name = "Cake";

    public Cake(String name) {
        this.name = name;
    }

    public Cake(String name, int CAKE_COST) {
        this.name = name;
        this.CAKE_COST = CAKE_COST;
    }

    public int getCost() {
        return CAKE_COST;
    }

    public String getDescription() {
        return name;
    }

    // Used when adding Decorators
    private void changeCost(int amount) {
        CAKE_COST += amount;
    }

    // Used to add Decorators
    public void add(BaseDecorator decorator) {
        name = decorator.effect(name);

        changeCost(decorator.getPriceIncrease());
    }
}
