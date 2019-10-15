package sample;

import Attacks.*;
import Beings.Being;
import Beings.HumanBeing;
import Beings.SuperBeing;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class RandomBeingGenerator implements Serializable {


    public static Random rand = new Random();
    public static String[] name = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public static void main(String[] args) throws Exception {


        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(2);
            if (n == 0) {
                String numName = makeName();
                ArrayList<BaseAttack> attacks = new ArrayList<BaseAttack>();
                if (rand.nextInt(2) == 0)
                    attacks.add(new Punch(rand.nextInt(100)));
                else
                    attacks.add(new Kick(rand.nextInt(100)));


                HumanBeing being = new HumanBeing(numName, Being.BeingType.HumanBeing, rand.nextInt(100), rand.nextInt(100),
                        rand.nextInt(100), rand.nextInt(100), attacks);

                try {

                    FileOutputStream fos = new FileOutputStream("C:\\Users\\David\\Desktop\\Year 3\\Dis systems\\Fighters\\" + being.getName());
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(being);
                    oos.close();
                    fos.close();

                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }



                HumanBeing e = null;

                try {
                    FileInputStream fileIn = new FileInputStream("C:\\Users\\David\\Desktop\\Year 3\\Dis systems\\Fighters\\" + being.getName());
                    ObjectInputStream in = new ObjectInputStream(fileIn);

                    e = (HumanBeing) in.readObject();
                    in.close();
                    fileIn.close();
                    e.whoAreYou();
                    e.whatAreYou();
                    e.whatAreYouCapableOf();


                } catch (ClassNotFoundException c) {
                    c.printStackTrace();
                }


            } else {
                String numName = makeName();
                ArrayList<BaseAttack> attacks = new ArrayList<BaseAttack>();
                n = rand.nextInt(4);
                if (n == 0) {
                    attacks.add(new Punch(rand.nextInt(100)));
                } else if (n == 1) {
                    attacks.add(new Kick(rand.nextInt(100)));
                } else if (n == 2) {
                    attacks.add(new LaserEye(rand.nextInt(100)));
                } else if (n == 3) {
                    attacks.add(new FreezeRay(rand.nextInt(100)));
                }
                SuperBeing being = new SuperBeing(numName, Being.BeingType.SuperBeing, rand.nextInt(100), rand.nextInt(100),
                        rand.nextInt(100), rand.nextInt(100), attacks);

                try {

                    FileOutputStream fos = new FileOutputStream("C:\\Users\\David\\Desktop\\Year 3\\Dis systems\\Fighters\\" + being.getName());
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(being);
                    oos.close();
                    fos.close();

                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }


                SuperBeing e = null;

                try {
                    FileInputStream fileIn = new FileInputStream("C:\\Users\\David\\Desktop\\Year 3\\Dis systems\\Fighters\\" + being.getName());
                    ObjectInputStream in = new ObjectInputStream(fileIn);

                    e = (SuperBeing) in.readObject();
                    in.close();
                    fileIn.close();
                    e.whoAreYou();
                    e.whatAreYou();
                    e.whatAreYouCapableOf();


                } catch (ClassNotFoundException c) {
                    c.printStackTrace();
                }
            }


        }


    }


    public static String makeName() {
        String numName = "";
        for (int j = 0; j < 4; j++) {
            numName = numName + name[rand.nextInt(9)];
        }

        return numName;
    }
}
