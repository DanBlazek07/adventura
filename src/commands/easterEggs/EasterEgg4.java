package commands.easterEggs;

import commands.Command;

public class EasterEgg4 extends Command {
    @Override
    public String execute() {
        return "\u001B[31mException in thread \"main\" java.util.NoScamPossible: No scammable person found\n" +
                "\tat java.base/java.util.Scammer.scam(Scammer.java:69420)\u001B[0m";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
