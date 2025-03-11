package commands;

import world.Location;

public class Go extends Command {
    private Location l;
    @Override
    public String execute() {
        return "you went into the room" + l.getId();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
