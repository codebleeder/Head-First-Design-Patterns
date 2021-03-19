package pattern_01_strategy;

class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new Duck();
        mallardDuck.setFlyBehavior(new NormalFly());
        mallardDuck.setQuackBehavior(new NormalQuack());
        mallardDuck.fly();
        mallardDuck.quack();

        // change fly behavior:
        mallardDuck.setFlyBehavior(new NoFly());
        mallardDuck.fly();
    }
}
