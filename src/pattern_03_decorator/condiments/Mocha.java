package pattern_03_decorator.condiments;

import pattern_03_decorator.Beverage;
import pattern_03_decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }


    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
