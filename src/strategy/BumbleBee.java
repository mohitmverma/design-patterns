package strategy;

import strategy.algorithm.JumpBehaviour;
import strategy.algorithm.KickBehaviour;

public class BumbleBee extends Robot{
    public BumbleBee(JumpBehaviour jumpBehaviour, KickBehaviour kickBehaviour) {
        super(jumpBehaviour, kickBehaviour);
    }

}

