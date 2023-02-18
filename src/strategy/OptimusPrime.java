package strategy;

import strategy.algorithm.JumpBehaviour;
import strategy.algorithm.KickBehaviour;

public class OptimusPrime extends Robot{
    public OptimusPrime(JumpBehaviour jumpBehaviour, KickBehaviour kickBehaviour) {
        super(jumpBehaviour, kickBehaviour);
    }
}
