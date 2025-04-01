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
            return "\u001B[31mInvalid command\u001B[0m";
        } catch (Exception e) {
            return "\u001B[31mBut why\u001B[0m";
        }

    }

    @Override
    public boolean exit() {
        return false;
    }
}
