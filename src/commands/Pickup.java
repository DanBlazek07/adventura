package commands;

import items.Player;
import world.Location;
import world.World;

public class Pickup extends Command {
    public Pickup(Player player, World world) {
        this.player = player;
        this.world = world;
    }

    @Override
    public String execute() {
//        Location location = ;
//        if (location.isLocked())
        return "you picked up bread, it doesnt look the most delicious, but it is what it is";
//        return "you picked up wooden pickaxe, looks like its about to break anytime...";
//        return "you picked up golden pickaxe, shiny and cold to touch";
//        return "you picked up key, what room could it be for?";
//        return "there is nothing for you to pick up...";

    }

    @Override
    public boolean exit() {
        return false;
    }
}
