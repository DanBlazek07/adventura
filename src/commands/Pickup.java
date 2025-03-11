package commands;

public class Pickup extends Command {
    private boolean isFood = false;
    private boolean isWPick = false;
    private boolean isGPick = false;
    private boolean isKey = false;
    @Override
    public String execute() {
            if (isFood){
                return "you picked up bread, it doesnt look the most delicious, but it is what it is";
            } else if (isWPick){
                return "you picked up wooden pickaxe, looks like its about to break anytime...";
            } else if (isGPick){
                return "you picked up golden pickaxe, shiny and cold to touch";
            } else if (isKey) {
                return "you picked up key, what room could it be for?";
            } else {
                return "there is nothing for you to pick up...";
            }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
