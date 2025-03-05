package world;

public class Location {
    private String name;
    private int id;
    private int[] locations;

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
}
