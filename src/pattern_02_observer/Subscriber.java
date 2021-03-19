package pattern_02_observer;

public interface Subscriber {
    void update(float temp, float humidity, float pressure);
}
