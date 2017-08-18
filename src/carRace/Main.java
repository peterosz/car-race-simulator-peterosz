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
        Vehicle newCar = new Car();
        System.out.println(newCar.name);
        System.out.println(newCar.normalSpeed);
        System.out.println(newCar.getType());
        newCar.moveForAnHour(isRaining());
        System.out.println(newCar.getDistanceTraveled());

        Vehicle newCar2 = new Car();
        System.out.println(newCar2.name);
        System.out.println(newCar2.normalSpeed);
        System.out.println(newCar2.getType());
        newCar2.moveForAnHour(isRaining());
        System.out.println(newCar2.getDistanceTraveled());

        Vehicle newMotor = new Motorcycle();
        System.out.println(newMotor.name);
        Vehicle newMotor2 = new Motorcycle();
        newMotor.moveForAnHour(isRaining());
        newMotor2.moveForAnHour(isRaining());
        System.out.println(newMotor.getDistanceTraveled());
        System.out.println(newMotor2.name);
        System.out.println(newMotor2.getDistanceTraveled());


        /*
        createVehicles() // creates 10 cars, 10 trucks and 10 motorcycles
        simulateRace() // simulates the race by calling moveForAnHour() on every vehicle 50 times and setting whether its raining.
        printRaceResults() // prints each vehicle's name, distance traveled ant type.*/

    }
}
