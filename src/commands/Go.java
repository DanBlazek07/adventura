package commands;

import world.*;

public class Go extends Command {
    private World w = new World();
    @Override
    public String execute() {
        return w.loadLocation();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
