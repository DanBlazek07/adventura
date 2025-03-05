package commands;

public class Destroy extends Command {
    private boolean hasPickaxe = false;

    @Override
    public String execute() {
        if (hasPickaxe){
            return "wall destroyed";
        } else {
            return "u cant destroy the wall";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
