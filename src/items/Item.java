package items;

public abstract class Item {
    protected String name;
    protected boolean isTaken = false;
    protected boolean isInInventory = false;
    public String pickUp(){
        if(!isTaken){
            isTaken = true;
            return "item picked up";
        }
        return "you cant pick up anything";
    }
    public boolean inventoryCheck(){
        return isInInventory;
    }
}
