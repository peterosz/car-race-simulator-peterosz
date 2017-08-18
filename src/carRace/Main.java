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

    public static boolean limit = isRaining(); // Since cars are so fast there is a 30% chance that they can go only with 70km/h speed.


    public static void main(String[] args) {
        Vehicle newCar = new Car();
        Car.setSpeedLimit(limit);
        System.out.println(newCar.name);
        System.out.println(newCar.normalSpeed);
        System.out.println(newCar.getType());
        newCar.moveForAnHour(isRaining());
        newCar.moveForAnHour(isRaining());
        System.out.println(newCar.getDistanceTraveled());

        /*
        createVehicles() // creates 10 cars, 10 trucks and 10 motorcycles
        simulateRace() // simulates the race by calling moveForAnHour() on every vehicle 50 times and setting whether its raining.
        printRaceResults() // prints each vehicle's name, distance traveled ant type.*/

    }
}
