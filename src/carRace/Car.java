package carRace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car extends Vehicle{

    public Car(){
        type = "car";
        name = createCarName();
        normalSpeed = Main.random.nextInt(31)+80;
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
    public void moveForAnHour(boolean raining) { // Since cars are so fast there is a 30% chance that they can go only with 70km/h speed.
        if (raining) normalSpeed = 70;
        distanceTraveled += normalSpeed;
    }
}
