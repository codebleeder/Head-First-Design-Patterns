package pattern_05_abstract_factory;

public class IndiaCarFactory implements CarFactory{
    public Car produceCar(CarType type) {
        switch (type) {
            case SEDAN: return new Car(type, "India", "Tigor");
            case SUV: return new Car(type, "India", "Nexon");
        }
        return null;
    }
}
