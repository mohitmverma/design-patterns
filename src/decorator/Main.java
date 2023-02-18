package decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pizza Maker Using Decorator Design Pattern");

        Pizza pizza = new Margherita();
        System.out.println( pizza.getDescription() + " Cost :" + pizza.getCost());

        Pizza farmHouse = new FarmHouse();
        System.out.println( farmHouse.getDescription() + " Cost :" + farmHouse.getCost());

        // Topping
        Pizza tomatoSauce = new TomatoSauce(farmHouse);
        System.out.println( tomatoSauce.getDescription() + " Cost :" + tomatoSauce.getCost());

        Pizza cheese = new Cheese(tomatoSauce);
        System.out.println( cheese.getDescription() + " Cost :" + cheese.getCost());

        Pizza newPizza = new TomatoSauce(new Cheese(new TomatoSauce(new Margherita()))) ;
        System.out.println( newPizza.getDescription() + " Cost :" + newPizza.getCost());


    }
}
