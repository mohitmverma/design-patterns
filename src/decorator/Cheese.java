package decorator;

public class Cheese extends ToppingDecorator {

    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 40;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with Cheese";
    }
}
