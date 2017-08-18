package carRace;

import java.util.Random;

public class Main {

    public static Random random = new Random();


    public static boolean isRaining(){ //30% chance of rain every hour
        int rainChance = random.nextInt(100);
        if (rainChance <= 30){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {


        /*
         // prints each vehicle's name, distance traveled ant type.*/

    }
}
