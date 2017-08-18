package carRace;

public class Motorcycle extends Vehicle{

    static int nameNumber;

    public Motorcycle(){
        type = "motorcycle";
        name = "Motorcycle " + ++nameNumber;
        normalSpeed = 100;
    }

    @Override
    public void moveForAnHour(boolean raining) { // Since cars are so fast there is a 30% chance that they can go only with 70km/h speed.
        if (raining){
            normalSpeed -= (5 + (Main.random.nextInt(45)));
        } else {
            normalSpeed = 100;
        }
        distanceTraveled += normalSpeed;
    }

}
