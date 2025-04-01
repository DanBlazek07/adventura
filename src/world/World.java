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
        current = 1;
        location = world.get(current);
    }

    public String getLocation() {
        return location.getName();
    }

    public int getId() {
        return location.getId();
    }

    /**
     * loads the location
     **/
    public String loadLocation() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/world/rooms/rooms.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] text = line.split("-");
                Location l = new Location(Integer.parseInt(text[0]), text[1], locations(text[2]));
                System.out.println(text[2]);
                world.put(Integer.parseInt(text[0]), l);
            }
            return "successfully read";
        } catch (IOException e) {
            return "something failed";
        }
    }

    /**
     * prints out nearby rooms
     **/
    public String closeRooms() {
        return world.get(current).getLocString();
    }

    /**
     * splits locations player can move into
     **/
    private ArrayList<Integer> locations(String locations) {
        String[] location = locations.split(",");
        ArrayList<Integer> locationss = new ArrayList<>();
        for (int i = 0; i < location.length; i++) {
            locationss.add(Integer.parseInt(location[i]));
            System.out.println(location[i]);
        }
        return locationss;
    }

    /**
     * moves the player accordingly
     **/
    public String move(int Id) {
        if (world.containsKey(current) && world.get(current).getLoc().contains(Id)) {
            current = Id;
            return world.get(current).inside();
        }
        current = 0;
        return "failed to move";
    }
}
