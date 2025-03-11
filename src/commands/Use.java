package commands;

import items.keys.*;
import world.*;

public class Use extends Command{
    Key k = new Key();
    private Location location;
    @Override
    public String execute() {
        if (k.inventoryCheck() && k.canUnlock()){
            return "door to the room" + location.getId() + "unlocked";
        } else if (k.inventoryCheck()) {
            return "as hard as you tried, the door didnt open... try a different one...";
        } else {
            return "you cant do anything...";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
