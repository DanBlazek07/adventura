package commands;

import items.Food;

public class Eat extends Command {
    Food f = new Food();

    @Override
    public String execute() {
        if (f.inventoryCheck() && f.hungerCheck()){
            return "you ate your bread... yummy";
        } else if (f.inventoryCheck()) {
            return "you wanted to eat your bread but you realized you arent even hungry...";
        } else {
            return "you wanted to eat, but you had nothing to eat...";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}