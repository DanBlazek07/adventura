package commands;

public class Talk extends Command {
    private boolean hasPerson = false;
    @Override
    public String execute() {
        if (hasPerson){
            return "";
        } else {
            return "you are alone in this place";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
