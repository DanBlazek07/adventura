package commands;
import items.*;
import items.pick.*;
import world.World;

public class Destroy extends Command {
    public Destroy(Player player, World world) {
        this.player = player;
        this.world = world;
    }

    @Override
    public String execute() {
        Inventory inv = player.getInventory();
        Item item = inv.getInventory("pickaxe");
        if (item instanceof Pickaxe) {
            Pickaxe pick = (Pickaxe) item;
            if (pick.canDestroy()){
                return world.breakWall();
            }return "you cant destroy the wall";
        }
        return "but you dont own anything to destroy with...";
    }

    @Override
    public boolean exit() {
        return false;
    }
}