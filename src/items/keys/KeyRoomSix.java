package items.keys;

public class KeyRoomSix extends Key {
    /**
     * writes out some text after unlocking the room
     **/
    public String roomSixUnlock(){
        if (canUnlock()){
            return "as you step in, you see this is a living room, but the door is just not at the right place... \nit lies at the floor... but why?";
        } else return "the door to room 6 isn't there for no reason...";
    }
}
