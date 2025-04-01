package items.keys;

public class KeyRoomFive extends Key {
    /**
     * writes out some text after unlocking the room
     **/
    public String roomFiveUnlock(){
        if (canUnlock()){
            return "this room was oddly familiar... it was an equipment room... \nbut how do you know the room?";
        } else return "just by looking at the doors for room 5, you knew you cant open them without a key";
    }
}
