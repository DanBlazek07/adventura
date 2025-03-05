package commands;

public class Exit extends Command {
    @Override
    public String execute() {
        return "byeee";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
