package items.pick;

import items.Item;

public class Pickaxe extends Item {
    protected boolean isCorrectTool = false;

    public boolean canDestroy(){
        return isCorrectTool;
    }
}
