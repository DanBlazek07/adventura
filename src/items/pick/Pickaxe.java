package items.pick;

import items.Item;

public class Pickaxe extends Item {
    protected boolean isCorrectTool = false;
    /**
     * checks whether the wall is breakable with the pickaxe
     **/
    public boolean canDestroy(){
        return isCorrectTool;
    }
}
