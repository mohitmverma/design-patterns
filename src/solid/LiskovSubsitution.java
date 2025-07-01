package solid;

class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird {}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}

/*
* Definition: Subtypes must be substitutable for their base types without altering the correctness of the program
* */

public class LiskovSubsitution {
    public static void main(String[] args) {
        Bird bird = new Sparrow(); // Works
        bird.fly();

        Bird penguin = new Penguin(); // Violates LSP
        penguin.fly();
    }
}

// To fix the LSP violation, we can create a NonFlyingBird and FlyingBird hierarchy.
