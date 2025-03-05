package world;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class World {
    private HashMap<Integer, Location> world = new HashMap<>();
    private Location location;

    public World() {
        loadLocation();
        location = world.get(1);
    }

    public String getLocation() {
        return location.getName();
    }

    public int getId(){
        return location.getId();
    }

    public boolean loadLocation(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/rooms/rooms.txt"));
            String line = br.readLine();
            while (line != null){
                String[] text = line.split("-");
                Location l = new Location(Integer.parseInt(text[0]), text[1], locations(text[2]));
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    private int[] locations(String locations){
        String[] location = locations.split(",");
        int[] locationss = new int[locations.length()];
        for (int i = 0; i < locations.length(); i++) {
            locationss[i] = Integer.parseInt(location[i]);
        }
        return locationss;
    }
}
