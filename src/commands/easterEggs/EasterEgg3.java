package commands.easterEggs;

import commands.Command;

public class EasterEgg3 extends Command {
    @Override
    public String execute() {
        return "burn alive, I will use flammenwerfer!";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
