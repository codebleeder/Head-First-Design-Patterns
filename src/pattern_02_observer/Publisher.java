package pattern_02_observer;

public interface Publisher {
    void registerSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void publish();
}
