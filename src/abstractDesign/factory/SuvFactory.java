package abstractDesign.factory;

import abstractDesign.cars.Car;

public class SuvFactory extends CarFactory{
    @Override
    public Car getCar(String brand) {
        return null;
    }
}
