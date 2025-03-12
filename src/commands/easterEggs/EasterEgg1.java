package commands.easterEggs;

import commands.*;

public class EasterEgg1 extends Command {
    @Override
    public String execute() {
        return "I didnt just let Damik write this, did I?";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
