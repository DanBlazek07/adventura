package world;

import java.util.ArrayList;

public class Location {
    private String name;
    private int id;
    private int[] locations;
    private ArrayList<Integer> loc = new ArrayList<>();
    private ArrayList<String> item = new ArrayList<>();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int[] getLocations() {
        return locations;
    }

    public Location(int id, String name, int[] locations) {
        this.name = name;
        this.id = id;
        this.locations = locations;
    }

    private boolean rooms(String[] var){
        String[] connection = var[2].split(",");
        String[] items = var[0].split("");
        for (int i = 0; i < connection.length; i++){
            loc.add(Integer.valueOf(connection[i]));
            return true;
        }
        for (int i = 0; i < items.length; i++){
            item.add(items[i]);
            return true;
        }
        return false;
    }
    public ArrayList<Integer> getLoc() {
        return loc;
    }

    public void setLoc(ArrayList<Integer> loc) {
        this.loc = loc;
    }

    public ArrayList<String> getItem() {
        return item;
    }

    public void setItem(ArrayList<String> item) {
        this.item = item;
    }

    public String inside(){
        String moved = "moved";
        return moved;
    }
}
