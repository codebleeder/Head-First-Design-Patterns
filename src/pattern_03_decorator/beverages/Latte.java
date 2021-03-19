package pattern_03_decorator.beverages;

import pattern_03_decorator.Beverage;

public class Latte extends Beverage {
    public Latte() {
        setDescription("Latte");
    }

    public double cost() {
        return 3.99;
    }
}
