package abstractDesign.factory;

import abstractDesign.cars.Car;
import abstractDesign.cars.sedan.Dzire;
import abstractDesign.cars.sedan.Tigor;
import abstractDesign.cars.sedan.Verna;

public class SedanFactory extends CarFactory{
    @Override
    public Car getCar(String brand) {
        if(brand  == "TATA") {
            return new Tigor();
        } else if(brand == "Hyundai") {
            return new Verna();
        } else if (brand == "Maruti") {
            return new Dzire();
        }

        return null;
    }
}
