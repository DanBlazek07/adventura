package commands.easterEggs;

import commands.Command;

public class EasterEgg3 extends Command {
    @Override
    public String execute() {
        return "\u001B[38;2;255;105;0mburn alive, I will use flammenwerfer!\u001B[0m";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
