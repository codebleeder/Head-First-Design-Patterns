package pattern_05_abstract_factory;

public class US_CarFactory implements CarFactory{
    public Car produceCar(CarType type) {
        switch (type) {
            case SEDAN: return new Car(type, "USA", "Civic");
            case SUV: return new Car(type, "USA", "CRV");
        }
        return null;
    }
}
