package commands.easterEggs;

import commands.Command;

public class EasterEgg2 extends Command {
    @Override
    public String execute() {
        return "you found... ABSOLUTE NOTHING";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
