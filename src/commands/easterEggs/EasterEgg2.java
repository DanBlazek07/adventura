package commands.easterEggs;

import commands.Command;

public class EasterEgg2 extends Command {
    @Override
    public String execute() {
        return "\u001B[36myou found... \u001B[46mABSOLUTE NOTHING\u001B[0m";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
