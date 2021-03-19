package pattern_03_decorator.beverages;

import pattern_03_decorator.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        setDescription("Espresso");
    }

    public double cost() {
        return 2.99;
    }
}
