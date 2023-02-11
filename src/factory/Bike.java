package factory;

public class Bike extends Vehicle{

    int wheel;

    public Bike(int wheel) {
        this.wheel = wheel;
    }
    @Override
    public int getWheel() {
        return this.wheel;
    }
}
