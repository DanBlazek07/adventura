package items;

import java.util.HashMap;

public class Inventory {
    private HashMap<String, Item> inventory;

    public Inventory() {
        inventory = new HashMap<>();
    }

    public Item getInventory(String name) {
        return inventory.get(name);
    }

    public void setInventory(String name, Item item) {
        inventory.put(name, item);
    }

    public boolean hasItem(String name) {
        return inventory.containsKey(name);
    }
}
