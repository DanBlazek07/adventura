package items.keys;

public class KeyRoomTwo extends Key {
    /**
     * writes out some text after unlocking the room
     **/
    public String roomTwoUnlock(){
        if (canUnlock()){
            return "the key was for room with number 2... \nit looks as a larder...";
        } else return "you dont have the key to room 2 quite yet";
    }
}
