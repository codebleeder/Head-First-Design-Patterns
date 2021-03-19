package pattern_01_strategy;

public class NoFly implements FlyBehavior {
    public void fly() {
        System.out.println("no fly");
    }
}
