package commands;

public class Eat extends Command {
    private boolean hasFood = false;
    private boolean needsToEat = false;

    @Override
    public String execute() {
        if (hasFood && needsToEat){
            return "u ate ur food... yummy";
        } else if (hasFood) {
            return "u wanted to eat ur food but u realized ur not even hungry";
        } else {
            return "u wanted to eat, but u had nothing to eat...";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}