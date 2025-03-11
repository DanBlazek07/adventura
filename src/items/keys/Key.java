package items.keys;

import items.Item;

public class Key extends Item {
    protected boolean isCorrectKey = false;
    public boolean canUnlock(){
        return isCorrectKey;
    }
}
