package items;

public abstract class Item {
    protected String name;
    protected boolean isTaken = false;
    protected boolean isInInventory = false;
    /**
     * picks up item if it is existent
     **/
    public String pickUp(){
        if(!isTaken){
            isTaken = true;
            return "item picked up";
        }
        return "you cant pick up anything";
    }
    /**
     * checks if player has the item in inventory
     **/
    public boolean inventoryCheck(){
        return isInInventory;
    }
}
