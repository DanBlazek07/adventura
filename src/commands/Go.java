package commands;

import world.*;

import java.util.Scanner;

public class Go extends Command {
    private World w;
    private Scanner sc;

    @Override
    public String execute() {
        System.out.println("rooms: " + w.closeRooms());
        String s = sc.nextLine();
        try {
            int value = Integer.parseInt(s);
            if (value > 0 && value < 12) {
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

    public Go(World w) {
        this.w = w;
        sc = new Scanner(System.in);
    }
}
