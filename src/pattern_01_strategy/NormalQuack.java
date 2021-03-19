package pattern_01_strategy;

public class NormalQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("normal quack");
    }
}
