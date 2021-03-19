package pattern_09_facade;

class Main {
    public static void main(String[] args) {
        CarFacade car = new CarFacade();
        car.startEngine();
        car.stopEngine();
    }
}
