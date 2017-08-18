package carRace;

import java.util.Random;

public class Main {

    public static Random random = new Random();


    public static boolean isRaining(){ //30% chance of rain every hour PLUS im using this for the cars 30% of speedlimit too :)
        int rainChance = random.nextInt(100);
        if (rainChance <= 30){
            return true;
        }
        return false;
    }

    static Vehicle[] createVehicles(){

        Vehicle[] vehicles = new Vehicle[30];

        for (int i = 0; i < 10; i++){
            Vehicle car = new Car();
            vehicles[i] = car;
        }

        for (int i = 10; i < 20; i++){
            Vehicle motor = new Motorcycle();
            vehicles[i] = motor;
        }

        for (int i = 20; i < 30; i++){
            Vehicle truck = new Truck();
            vehicles[i] = truck;
        }
        return vehicles;
    }

    private static Vehicle[] simulateRace(Vehicle[] vehicles){
        for (int hours = 1; hours <= 50; hours++){
            for (int i = 0; i < 30; i++) {
                vehicles[i].moveForAnHour(isRaining());
            }
        }
        return vehicles;
    }

    private static void printRaceResults(Vehicle[] vehicles){
        int winner = 0;
        int temp = 0;
        for (int i = 0; i < 30; i++){
            System.out.println(vehicles[i].name + ": " + vehicles[i].getDistanceTraveled());
            if (temp < vehicles[i].getDistanceTraveled()){
                temp = vehicles[i].getDistanceTraveled();
                winner = i;
            }
        }
        System.out.println("\nThe winner is a " + vehicles[winner].getType() + "!" + "\n"
                            + "Name: " + vehicles[winner].name + "\n" + "Distance traveled: "
                            + vehicles[winner].getDistanceTraveled());
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = createVehicles();
        Vehicle[] race = simulateRace(vehicles);
        printRaceResults(race);
    }
}
