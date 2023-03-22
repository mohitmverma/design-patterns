package abstractDesign.absFactory;

import abstractDesign.cars.Car;
import abstractDesign.factory.MiniFactory;
import abstractDesign.factory.SedanFactory;
import abstractDesign.factory.SuvFactory;

public class CarType {

    private MiniFactory miniFactory;
    private SedanFactory sedanFactory;
    private SuvFactory suvFactory;

    public CarType() {
        miniFactory = new MiniFactory();
        sedanFactory = new SedanFactory();
        suvFactory = new SuvFactory();
    }

    public Car getInstance(String carType, String brand) {
        if(carType == "MINI") {
            return miniFactory.getCar(brand);
        } else if (carType == "SEDAN") {
            return sedanFactory.getCar(brand);
//        } else if (carType == "SUV") {
//            return suvFactory.getCar(brand);
        } else  {
            System.out.println("INVALID carType");
        }
        return null;
    }
}
