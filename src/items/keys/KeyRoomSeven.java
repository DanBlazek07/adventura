package items.keys;

public class KeyRoomSeven extends Key {
    /**
     * writes out some text after unlocking the room
     **/
    public String roomSevenUnlock(){
        if (canUnlock()){
            return "this room was small, and you quickly saw it...";
        } else return "are you sure about this? without a key to room 7?";
    }
}
