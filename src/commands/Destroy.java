package commands;

import items.pick.Pickaxe;

public class Destroy extends Command {
    Pickaxe p = new Pickaxe();

    @Override
    public String execute() {
        if (p.canDestroy()){
            return "wall destroyed";
        } else {
            return "you cant destroy the wall";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
