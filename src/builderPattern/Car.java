package builderPattern;

public class Car {
    private String make;
    private String model;
    public int year;
    public int price;

    private Car(CarBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.price = builder.price;
    }


    public static class CarBuilder {
        private String make;
        private String model;
        private int year;
        private int price;

        public CarBuilder() {
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
