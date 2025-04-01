package items;

public class Food extends Item {
    private boolean isHungry;
    /**
     * checks if the player is hungry to eat food*/
    public boolean hungerCheck(){
        return isHungry;
    }
}
