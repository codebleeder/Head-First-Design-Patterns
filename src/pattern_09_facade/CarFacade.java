package pattern_09_facade;

public class CarFacade {
    private DoorController doorController = new DoorController();
    private FuelInjector fuelInjector = new FuelInjector();

    public void startEngine(){
        doorController.lock();
        fuelInjector.on();
        fuelInjector.inject();
        System.out.println("engine started");
    }

    public void stopEngine(){
        fuelInjector.off();
        doorController.unlock();
        System.out.println("engine stopped");
    }
}
