package pattern_05_abstract_factory;

class Main {
    public static void main(String[] args) {
        Car indianSedan = FactoryProducer.getFactory("India").produceCar(CarType.SEDAN);
        System.out.println(indianSedan.toString());

        Car americanSUV = FactoryProducer.getFactory("USA").produceCar(CarType.SUV);
        System.out.println(americanSUV);
    }
}
