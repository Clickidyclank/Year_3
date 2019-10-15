package Beings;

import Attacks.BaseAttack;

import java.io.Serializable;
import java.util.ArrayList;

public class HumanBeing extends Being implements Serializable {


    public HumanBeing(String name,BeingType type,int health, int stamina, int speed, int power, ArrayList<BaseAttack> attacks) {

        super(name, health, stamina, speed, power,attacks);
       this.type=BeingType.HumanBeing;

    }

    public HumanBeing(String name,  int health, int stamina, int speed, int power, ArrayList<BaseAttack> attacks, SuperBeing superBeing) {

        super(name, health, stamina, speed, power, attacks);
        superBeing.getName();
    }
}
