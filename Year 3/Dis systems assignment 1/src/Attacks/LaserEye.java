package Attacks;

import java.io.Serializable;

public class LaserEye extends BaseAttack implements Serializable {


    public LaserEye(int damage) {
        super(damage);
        this.name = "Lazer Eyes";
    }
}
