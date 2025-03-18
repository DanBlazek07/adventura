package world;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class World {
    private HashMap<Integer, Location> world = new HashMap<>();
    private Location location;
    private int current;

    public World() {
        loadLocation();
        location = world.get(0);
    }

    public String getLocation() {
        return location.getName();
    }

    public int getId(){
        return location.getId();
    }

    public String loadLocation(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/world/rooms/rooms.txt"));
            String line = br.readLine();
            while (line != null){
                String[] text = line.split("-");
                Location l = new Location(Integer.parseInt(text[0]), text[1], locations(text[2]));
            }
            String f = null;
            ArrayList<Integer> fn = world.get(current).getLoc();
            for (int i = 0; i < fn.size(); i++){
                f = world.get(fn.get(i)).getId() + world.get(fn.get(i)).getName();
            }
            return "you can go into: " + f;
        } catch (IOException e) {
            return null;
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
