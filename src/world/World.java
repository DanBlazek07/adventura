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
    private String f = null;

    public World() {
        loadLocation();
        current = 0;
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
            String line;
            while ((line = br.readLine())!= null){
                String[] text = line.split("-");
                Location l = new Location(Integer.parseInt(text[0]), text[1], locations(text[2]));
            }
            return "successfully read";
        } catch (IOException e) {
            return "something failed";
        }
    }
    public String closeRooms(){
        ArrayList<Integer> fn = world.get(current).getLoc();
        for (int i = 0; i < fn.size(); i++){
            f = world.get(fn.get(i)).getId() + world.get(fn.get(i)).getName();
        }
        return f;
    }

    private int[] locations(String locations){
        String[] location = locations.split(",");
        int[] locationss = new int[locations.length()];
        for (int i = 0; i < location.length-1; i++) {
            locationss[i] = Integer.parseInt(location[i]);
        }
        return locationss;
    }

    public String move(int Id){
        if (world.get(current).getLoc().contains(Id) && world.containsKey(current)){
            current = Id;
            return world.get(current).inside();
        }
        current = 0;
        return "failed to move";
    }
}
