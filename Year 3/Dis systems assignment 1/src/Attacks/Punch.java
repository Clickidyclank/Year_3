package Attacks;

import java.io.Serializable;

public class Punch extends BaseAttack implements Serializable {


    public Punch(int damage) {
        super(damage);
        this.name = "Punch";

    }


}
