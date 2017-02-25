package ch11.ex27;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Filler {
    public static void main(String[] args) {
        Queue<Command> commands = new LinkedList<>();
        Random rnd = new Random();
        for(int i = 0 ; i < 30; i++){
            Command temp = new Command(String.valueOf(rnd.nextInt(40)));
            commands.add(temp);
        }
        System.out.print(commands);
        Executer executer = new Executer();
        executer.method(commands);

    }
}
