package items.keys;

public class KeyRoomThree extends Key {
    public String roomThreeUnlock(){
        if (canUnlock()){
            return "as the key to room 3 entered the keyhole, it felt weird... \nalmost as if though someone, or something, was contacting you...";
        } else return "you tried to open the doors to room 3 by force, they looked weak, but they stayed shut...";

    }
}
