package abstractDesign.factory;

import abstractDesign.cars.Car;

public abstract class CarFactory {
    public abstract Car getCar(String brand);
}
