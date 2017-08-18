package carRace;

public class Truck extends Vehicle{

    public Truck(){
        type = "truck";
        name = randomNumber.toString();
    }

    Integer randomNumber = Main.random.nextInt(1000);
    int breakdownTurnsLeft;

    @Override
    public void moveForAnHour(boolean raining) {
        if (breakdownTurnsLeft != 0){
            normalSpeed = 0;
            breakdownTurnsLeft--;
        }
        else if (breakdownTurnsLeft == 0){
            normalSpeed = 100;
            int breakdown = Main.random.nextInt(101);
            if (breakdown <= 5) breakdownTurnsLeft = 2;
        }
        distanceTraveled += normalSpeed;
    }
}
