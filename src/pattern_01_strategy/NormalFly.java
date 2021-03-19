package pattern_01_strategy;

public class NormalFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("normal fly");
    }
}
