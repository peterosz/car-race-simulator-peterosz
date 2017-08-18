package carRace;

public class Motorcycle extends Vehicle{

    static int nameNumber;

    public Motorcycle(){
        type = "motorcycle";
        name = "Motorcycle " + ++nameNumber;
    }

    @Override
    public void moveForAnHour(boolean raining) {
        if (raining){
            normalSpeed -= (5 + (Main.random.nextInt(45)));
        } else {
            normalSpeed = 100;
        }
        distanceTraveled += normalSpeed;
    }

}
