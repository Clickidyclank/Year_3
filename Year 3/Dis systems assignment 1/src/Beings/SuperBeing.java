package Beings;

import Attacks.BaseAttack;
import Beings.Being;

import Beings.HumanBeing;

import java.io.Serializable;
import java.util.ArrayList;

public class SuperBeing extends Being implements Serializable {




    public SuperBeing(String name, BeingType type, int health, int stamina, int speed, int power, ArrayList<BaseAttack> attacks) {
        
        super(name, health, stamina, speed, power,attacks);
        this.type=BeingType.SuperBeing;

    }
    public SuperBeing(String name, BeingType type, int health, int stamina, int speed, int power, ArrayList<BaseAttack> attacks, HumanBeing humanBeing){

        super(name, health, stamina, speed, power,attacks);
        humanBeing.getName();
    }

}
