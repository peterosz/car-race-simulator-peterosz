package carRace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car extends Vehicle{

    // holds the current distance traveled.

    public Car(){
        type = "car";
        name = createCarName();
        normalSpeed = Main.random.nextInt(30)+80;
    }
    public static void setSpeedLimit(boolean limit){
        if (limit) {
            Car.normalSpeed = 70;
        }
    }

    public static String createCarName(){

        List<String> possibilities = new ArrayList(Arrays.asList("Bullet", "Icon", "Formula", "Behemoth",
                "Deputy", "Essence", "Raven", "Portrait", "Triumph", "Hydra", "Twister", "Spire", "Daydream", "Whim",
                "Sanctuary", "Lightning", "Temperament", "Tarragon", "Wolf", "Empire", "Dynamics",
                "Marvel", "Dawn", "Union", "Spirit", "Inferno", "Patron", "Thriller", "Encounter", "Ivory",
                "Magic", "Lioness", "Dusk", "Millenium", "Intro"));
        int listLength = possibilities.size();
        String name = possibilities.get(Main.random.nextInt(listLength)) + " "
                    + possibilities.get(Main.random.nextInt(listLength));
        return name;
    }

    @Override
    public void moveForAnHour() { // The vehicle travels for an hour. It increases the distance traveled. Call this from the main class only!
        distanceTraveled += normalSpeed;
    }
}
