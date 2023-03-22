package abstractDesign.factory;

import abstractDesign.cars.mini.Alto;
import abstractDesign.cars.Car;
import abstractDesign.cars.mini.I10;
import abstractDesign.cars.mini.Nano;

public class MiniFactory extends CarFactory {

    public Car getCar(String brand) {
        if(brand  == "TATA") {
            return new Nano();
        } else if(brand == "Hyundai") {
            return new I10();
        } else if (brand == "Maruti") {
            return new Alto();
        } else {
            System.out.println("Brand not found");
        }
        return null;
    }
}
