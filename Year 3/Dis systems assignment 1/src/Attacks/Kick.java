package Attacks;

import java.io.Serializable;

public class Kick extends BaseAttack implements Serializable {

    public Kick(int damage) {
        super(damage);
        this.name = "Kick";

    }
}
