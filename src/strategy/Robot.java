package strategy;

import strategy.algorithm.JumpBehaviour;
import strategy.algorithm.KickBehaviour;

public class Robot {
    private JumpBehaviour jumpBehaviour;
    private KickBehaviour kickBehaviour;

    public Robot(JumpBehaviour jumpBehaviour, KickBehaviour kickBehaviour) {
        this.jumpBehaviour = jumpBehaviour;
        this.kickBehaviour = kickBehaviour;
    }

    void display() {
        jumpBehaviour.jump();
        kickBehaviour.kick();
    }

}
