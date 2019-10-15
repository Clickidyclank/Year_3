package Attacks;

import java.io.Serializable;

public class FreezeRay extends BaseAttack implements Serializable {

    public FreezeRay(int damage) {
        super(damage);
        this.name = "Freeze Ray";



    }
}
