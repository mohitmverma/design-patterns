package abstractDesign;

import abstractDesign.absFactory.CarType;
import abstractDesign.cars.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abtract Factory design");

        CarType carType = new CarType();
        Car car = carType.getInstance("MINI", "TATA");
        System.out.println(car.carName() + " " + car.toString());

        Car car2 = carType.getInstance("SEDAN", "Maruti");
        System.out.println(car2.carName() + " " + car2.toString());


    }
}
