package ch11.ex29;

import java.util.PriorityQueue;

public class SimpleClass extends Object {
    public static void main(String[] args) {
        PriorityQueue<SimpleClass> priorityQueue = new PriorityQueue<>();
        for(int i = 0; i < 20; i++){
            priorityQueue.offer(new SimpleClass());
        }
        while(priorityQueue.peek() != null){
            System.out.println(priorityQueue.poll());
        }
    }
}
