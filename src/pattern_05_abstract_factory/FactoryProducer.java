package pattern_05_abstract_factory;

public class FactoryProducer {
    public static CarFactory getFactory(String location){
        switch (location) {
            case "India": return new US_CarFactory();
            case "USA": return new IndiaCarFactory();
            default: return null;
        }
    }
}
