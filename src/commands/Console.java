package commands;

import commands.easterEggs.*;

import java.util.HashMap;
import java.util.Scanner;

public class Console {

    private Scanner sc = new Scanner(System.in);
    private boolean exit = false;
    private HashMap<String, Command> commands;

    public void initialize() {
        Destroy destroy = new Destroy();
        Eat eat = new Eat();
        Pickup pickup = new Pickup();
        Talk talk = new Talk();
        Use use = new Use();
        Exit exit = new Exit();
        commands = new HashMap<>();
        commands.put("destroy", destroy);
        commands.put("d", destroy);
        commands.put("eat", eat);
        commands.put("e", eat);
        commands.put("go", new Go());
        commands.put("pickup", pickup);
        commands.put("p", pickup);
        commands.put("talk", talk);
        commands.put("t", talk);
        commands.put("use", use);
        commands.put("u", use);
        commands.put("exit", exit);
        commands.put("quit", exit);
        commands.put("kys", exit);
        commands.put("kms", exit);
        commands.put("tasemnice", new EasterEgg1());
        commands.put("easter egg", new EasterEgg2());
        commands.put("flammenwerfer", new EasterEgg3());
    }

    private void run() {
        System.out.print("> Command: ");
        String command = sc.nextLine();
        if (commands.containsKey(command.toLowerCase())) {
            System.out.println(commands.get(command.toLowerCase()).execute());
            exit = commands.get(command.toLowerCase()).exit();
        } else {
            System.out.println("\u001B[31mur unable to write commands, skill issue\u001B[0m");
        }
    }

    public void start() {
        initialize();
        //jak se dělají barvy jsem se zeptal ChatGPT
        System.out.println("\u001B[40m\u001B[34mcommands: destroy, eat, pickup, talk, use, go, exit\u001B[0m");
        do {
            run();
        } while (!exit);
    }
}
