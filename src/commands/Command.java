package commands;

import items.Player;
import world.World;

public abstract class Command {
    /**
     * does what the command has written in itself
     **/
    public World world;
    public Player player;
    public abstract String execute();
    public abstract boolean exit();
}
