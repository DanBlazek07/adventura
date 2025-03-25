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
                System.out.println(text[2]);
                world.put(Integer.parseInt(text[0]), l);
            }
            return "successfully read";
        } catch (IOException e) {
            return "something failed";
        }
    }
    public String closeRooms(int destination){
        if(world.containsKey(destination)){
            ArrayList<Integer> fn;
            fn = world.get(destination).getLoc(); //null
            System.out.println(fn + "init");
            world.get(destination).setLoc(fn);
            System.out.println(fn + "set");
            fn.add(destination);
            System.out.println(fn + "add");
        }
        return f;
    }

    private int[] locations(String locations){
        String[] location = locations.split(",");
        int[] locationss = new int[locations.length()];
        for (int i = 0; i < location.length; i++) {
            locationss[i] = Integer.parseInt(location[i]);
            System.out.println(location[i]);
        }
        return locationss;
    }

    public String move(int Id){
        if (world.containsKey(current) && world.get(current).getLoc().contains(Id)){
            current = Id;
            return world.get(current).inside();
        }
        current = 0;
        return "failed to move";
    }
}
