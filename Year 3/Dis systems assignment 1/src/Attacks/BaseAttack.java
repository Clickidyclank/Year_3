package Attacks;

import java.io.Serializable;

public abstract class BaseAttack implements Serializable {

    public int damage;
    public String name;


    public BaseAttack (int damage){

        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public String toString(){
        return name +" "+ damage;
    }
}


