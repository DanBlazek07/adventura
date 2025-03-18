package commands;

import world.*;

import java.util.Scanner;

public class Go extends Command {
    private World w = new World();
    private Scanner sc = new Scanner(System.in);

    @Override
    public String execute() {
        String s = sc.nextLine();
        switch (Integer.parseInt(s)) {
            case 1,2,3,4,5,6,7,8,9,10: w.move(Integer.parseInt(s));
            default: System.out.println("Invalid command");
        }
        System.out.println("you can move to: " + w.closeRooms() + "\nselect a room: ");
        return w.move(Integer.parseInt(s));
    }

    @Override
    public boolean exit() {
        return false;
    }
}
