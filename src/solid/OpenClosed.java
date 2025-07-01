package solid;

abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

/*
* Definition: Classes should be open for extension but closed for modification.
* */

public class OpenClosed {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}

interface InvoiceDao {
    double calculateArea();
}

class DatabaseInvoiceDao implements InvoiceDao {
    @Override
    public double calculateArea() {
        return 0;
    }
}

class FileInvoiceDao implements InvoiceDao {
    @Override
    public double calculateArea() {
        return 0;
    }
}


