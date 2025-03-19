package commands.easterEggs;

import commands.*;

public class EasterEgg1 extends Command {
    @Override
    public String execute() {
        return "\u001B[38;2;255;255;200mI didnt just let Damik write this, did I?\u001B[0m";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
