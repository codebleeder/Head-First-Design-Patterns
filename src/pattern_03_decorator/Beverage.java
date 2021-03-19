package pattern_03_decorator;

public abstract class Beverage {
    String description = "unknown beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
