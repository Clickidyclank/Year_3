package Beings;

import Attacks.BaseAttack;

import java.io.Serializable;
import java.util.ArrayList;



public abstract class Being implements Serializable {

     public enum BeingType {
        HumanBeing,
        SuperBeing
    }
    public BeingType type;

  private   String name;
  private   int health;
  private   int stamina;
  private   int power;
  private   int speed;
  private ArrayList<BaseAttack> attacks;


  public Being(String name,int health,int stamina,int speed,int power,ArrayList<BaseAttack> attacks){


        this.name=name;

        this.health=health;
        this.stamina=stamina;
        this.speed=speed;
        this.power = power;
        this.attacks=attacks;

  }

  public Being(){

  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BeingType getType() {
        return type;
    }

    public void setType(BeingType type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public ArrayList<BaseAttack> getAttacks() {
        return attacks;
    }

    public void setAttacks(ArrayList<BaseAttack> attacks) {
        this.attacks = attacks;
    }

    public void whoAreYou(){
      System.out.println("I am "+getName());
    }

    public void whatAreYou(){
      System.out.println("I am a "+getType());
    }

    public void whatAreYouCapableOf(){
      System.out.println(getAttacks());
    }



}
