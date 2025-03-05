package commands;

public class Pickup extends Command {
    private boolean itemOnGround = true;
    @Override
    public String execute() {
        if (itemOnGround){
            return "u picked up (item)";
        }
        else {
            return "there is nothing for u to pick up...";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
