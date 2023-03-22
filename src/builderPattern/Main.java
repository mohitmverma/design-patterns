package builderPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("builder design pattern");

        Car.CarBuilder carBuilder = new Car.CarBuilder();

        carBuilder.setPrice(10);
        carBuilder.setYear(200);

        Car car= carBuilder.build();

        System.out.println(car.year + " : " + car.price);

    }
}
