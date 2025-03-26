package commands;

import world.*;

import java.util.Scanner;

public class Go extends Command {
    private World w = new World();
    private Scanner sc = new Scanner(System.in);

    @Override
    public String execute() {
        try {
            String s = sc.nextLine();
            int value = Integer.parseInt(s);
            if (value > 0 && value < 12) {
                System.out.println("previous nearby rooms: " + w.closeRooms());
                return w.move(value);
            }
            sc.close();
            return "Invalid command";
        } catch (Exception e) {
            return "But why";
        }

    }

    @Override
    public boolean exit() {
        return false;
    }
}
