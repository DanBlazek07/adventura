package commands;

import world.*;

public class Use extends Command{
    private boolean hasKey = false;
    private boolean canUnlockDoor = false;
    private Location location;
    @Override
    public String execute() {
        if (hasKey && canUnlockDoor){
            return "door to the room" + location.getId() + "unlocked";
        } else if (hasKey) {
            return "as hard as u tried, the door didnt open... try a different one";
        } else {
            return "u cant do anything";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
