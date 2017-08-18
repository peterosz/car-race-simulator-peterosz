package carRace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Car extends Vehicle{
    // Since cars are so fast there is a 30% chance that they can go only with 70km/h speed.
    /*static setSpeedLimit(int limit) // Call this from the Main class!
    normalSpeed // the normal speed of the car. Set to a random number in the constructor between 80-110km/h.
    name*/
    public Car(){
        type = "car";
        name = createCarName();
    }

    public static String createCarName(){
        Random random = new Random();
        List<String> possibilities = new ArrayList(Arrays.asList("Bullet", "Icon", "Formula", "Behemoth",
                "Deputy", "Essence", "Raven", "Portrait", "Triumph", "Hydra", "Twister", "Spire", "Daydream", "Whim",
                "Sanctuary", "Lightning", "Temperament", "Tarragon", "Wolf", "Empire", "Dynamics",
                "Marvel", "Dawn", "Union", "Spirit", "Inferno", "Patron", "Thriller", "Encounter", "Ivory",
                "Magic", "Lioness", "Dusk", "Millenium", "Intro"));
        int listLength = possibilities.size();
        String name = possibilities.get(random.nextInt(listLength)) + " " + possibilities.get(random.nextInt(listLength));
        return name;
    }

    /*distanceTraveled // holds the current distance traveled.
    moveForAnHour() // The vehicle travels for an hour. It increases the distance traveled. Call this from the main class only!
*/
}
