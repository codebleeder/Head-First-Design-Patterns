package pattern_02_observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherPublisher implements Publisher {
    private List<Subscriber> subscribers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherPublisher() {
        subscribers = new ArrayList<>();
    }

    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }


    public void removeSubscriber(Subscriber subscriber) {
        int i = subscribers.indexOf(subscriber);
        if (i >= 0) {
            subscribers.remove(i);
        }
    }


    public void publish() {
        for(Subscriber subscriber: subscribers){
            subscriber.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        publish();
    }
}
