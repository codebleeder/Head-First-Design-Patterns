package pattern_03_decorator;

import pattern_03_decorator.beverages.Espresso;
import pattern_03_decorator.beverages.Latte;
import pattern_03_decorator.condiments.Mocha;
import pattern_03_decorator.condiments.Soy;

class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        espresso = new Soy(espresso);
        System.out.println(espresso.cost());

        Beverage latte = new Latte();
        latte = new Soy(latte);
        System.out.println(latte.getDescription());
    }
}
