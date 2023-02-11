package factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Factory Pattern");

        Vehicle car = VehicleFactory.getInstance("car", 4);
        System.out.println(car);

        Vehicle bike = VehicleFactory.getInstance("bike", 2);
        System.out.println(bike);
    }

}
