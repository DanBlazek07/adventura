package items.keys;

import items.Item;

public class Key extends Item {
    protected boolean isCorrectKey = false;
    /**
     * checks whether the key is correct
     **/
    public boolean canUnlock(){
        return isCorrectKey;
    }
}
