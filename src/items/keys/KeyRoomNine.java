package items.keys;

public class KeyRoomNine extends Key {
    public String roomNineUnlock(){
        if (canUnlock()){
            return "by using the key you found next to you, you unlocked a weird room... \nthe room had no windows or anything... it looked like a cell...";
        } else return "what are you doing here...? are you perhaps lost?";
    }
}
