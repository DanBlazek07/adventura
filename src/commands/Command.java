package commands;

public abstract class Command {
    /**
     * does what the command has written in itself
     **/
    public abstract String execute();
    public abstract boolean exit();
}
