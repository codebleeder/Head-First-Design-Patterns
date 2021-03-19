package pattern_05_abstract_factory;

public class Car {
    private CarType type;
    private String location;
    private String model;

    public Car(CarType type, String location, String model) {
        this.type = type;
        this.location = location;
        this.model = model;
    }

    @Override
    public String toString() {
        return type.toString() + " " + model + " " + location;
    }
}
