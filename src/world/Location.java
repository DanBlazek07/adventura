package world;

import items.Player;

import java.util.ArrayList;

public class Location {
    private String name;
    private int id;
    private int[] locations;
    private ArrayList<Integer> loc;
    private ArrayList<String> item = new ArrayList<>();
    private boolean hasWall = true;
    private boolean hasKey = false;
    private boolean locked = true;
    private boolean hasFood = false;
    private boolean hasGP = false;
    private boolean hasPick = false;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int[] getLocations() {
        return locations;
    }

    public boolean existsWall() {
        return hasWall;
    }

    public void breakWall() {
        this.hasWall = false;
    }

    public boolean isLocked() {
        return locked;
    }

    public void unlock() {
        this.locked = false;
    }

    public boolean hasKey() {
        return hasKey;
    }

    public void addKey() {
        this.hasKey = true;
    }

    public void removeKey() {
        this.hasKey = false;
    }

    public boolean hasGoldPick() {
        return hasGP;
    }

    public void addGoldPick() {
        this.hasGP = true;
    }

    public void removeGoldPick() {
        this.hasGP = false;
    }
    public boolean hasFood() {
        return hasFood;
    }

    public void addFood() {
        this.hasFood = true;
    }

    public void removeFood() {
        this.hasFood = false;
    }

    public boolean hasPick() {
        return hasFood;
    }

    public void addPick() {
        this.hasFood = true;
    }

    public void removePick() {
        this.hasFood = false;
    }

    public Location(int id, String name, ArrayList<Integer> locations) {
        this.name = name;
        this.id = id;
        this.loc = locations;

    }

    /**
     * checks what is in the room and how are rooms connected
     **/
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

    /**
     * prints out locations
     **/
    public String getLocString() {
        String x = "";
        for (int i = 0; i < loc.size(); i++){
            x += loc.get(i) + ",";
        }
        return x;
    }

    public ArrayList<Integer> getLoc() {
        return loc;
    }

    public boolean setLoc(ArrayList<Integer> loc) {
        this.loc = loc;
        return false;
    }

    public ArrayList<String> getItem() {
        return item;
    }

    public void setItem(ArrayList<String> item) {
        this.item = item;
    }

    /**
     * checks player is inside
     **/
    public String inside(){
        String moved = "moved";
        return moved;
    }
}
