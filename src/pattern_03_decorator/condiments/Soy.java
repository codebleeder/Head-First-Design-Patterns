package pattern_03_decorator.condiments;

import pattern_03_decorator.Beverage;
import pattern_03_decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.50 + beverage.cost();
    }


    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
