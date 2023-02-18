package strategy;

import strategy.algorithm.HighHeightKick;
import strategy.algorithm.LongJump;
import strategy.algorithm.LowHeightKick;
import strategy.algorithm.ShortJump;

public class Main {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern ");

        Robot robot = new BumbleBee(new LongJump(), new HighHeightKick());
        System.out.println("BumbleBee");
        robot.display();

        Robot robot2 = new OptimusPrime(new ShortJump(), new LowHeightKick());
        System.out.println("OptimusPrime");
        robot2.display();

    }
}
