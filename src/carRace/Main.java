package carRace;

import java.util.Random;

public class Main {


    public static boolean isRaining(){ //30% chance of rain every hour
        Random random = new Random();
        int rainChance = random.nextInt(100);
        if (rainChance <= 30){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Vehicle newCar = new Car();
        System.out.println(newCar.name);
        System.out.println(newCar.type);


        /*
        createVehicles() // creates 10 cars, 10 trucks and 10 motorcycles
        simulateRace() // simulates the race by calling moveForAnHour() on every vehicle 50 times and setting whether its raining.
        printRaceResults() // prints each vehicle's name, distance traveled ant type.*/

    }
}
