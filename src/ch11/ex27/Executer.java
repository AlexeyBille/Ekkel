package ch11.ex27;

import java.util.Queue;

public class Executer {
    public void method(Queue<Command> commands){
        while(commands.peek() != null){
            Command temp = commands.remove();
            temp.opetaion();
        }
    }
}
