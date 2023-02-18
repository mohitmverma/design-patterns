package decorator;

public class TomatoSauce extends ToppingDecorator {

    private Pizza pizza;
    public TomatoSauce(Pizza pizza) { this.pizza = pizza; }

    @Override
    public int getCost() {
        return pizza.getCost() + 10;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + " with TomatoSauce";
    }
}
