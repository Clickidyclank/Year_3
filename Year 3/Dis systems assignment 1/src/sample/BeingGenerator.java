//package sample;
//
//import Attacks.BaseAttack;
//import Attacks.FreezeRay;
//import Attacks.Kick;
//import Attacks.Punch;
//import Beings.Being;
//import Beings.BeingType;
//import Beings.HumanBeing;
//import Beings.SuperBeing;
//
//import java.util.ArrayList;
//
//public class BeingGenerator {
//
//
//    public static void main(String[] args) {
//
//        ArrayList<BaseAttack> attacks = new ArrayList<BaseAttack>();
//
//
//        attacks.add(new Punch( 3));
//        attacks.add(new Kick( 1));
//        attacks.add(new FreezeRay(1));
//
//        Being megaMutant = new SuperBeing("Mega mutant", BeingType.SuperBeing, 20, 15, 12, 24, attacks);
//
//        megaMutant.whoAreYou();
//        megaMutant.whatAreYou();
//        megaMutant.whatAreYouCapableOf();
//
//        attacks = new ArrayList<BaseAttack>();
//        attacks.add(new Kick(34));
//        attacks.add(new Punch(334));
//
//        HumanBeing bruce = new HumanBeing("Bruce banner",BeingType.HumanBeing,5,2,4,3,attacks);
//
//        bruce.whoAreYou();
//        bruce.whatAreYou();
//        bruce.whatAreYouCapableOf();
//
//        attacks = new ArrayList<BaseAttack>();
//        attacks.add(new Kick(4));
//        attacks.add(new Punch(5));
//
//        Being hulk = new SuperBeing("hulk",BeingType.SuperBeing,30,43,32,23,attacks,bruce);
//
//        hulk.whoAreYou();
//        hulk.whatAreYou();
//        hulk.whatAreYouCapableOf();
//
//
//    }
//
//
//}
//
