package pattern_02_observer;

public class CurrentConditionsDisplay implements Display, Subscriber {
    private float temperature;
    private float humidity;
    private float pressure;

    private Publisher publisher;

    public CurrentConditionsDisplay(Publisher publisher) {
        this.publisher = publisher;
        publisher.registerSubscriber(this);
    }

    public void display() {
        String out = String.format("current conditions: temp: %f  humidity: %f",
                temperature,
                humidity);
        System.out.println(out);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
