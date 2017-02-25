package ch11.ex28;

import java.util.PriorityQueue;
import java.util.Random;

public class PriorityLearn {
    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();
        Random rnd = new Random();
        for(int i = 0; i < 20; i++){
            priorityQueue.offer(rnd.nextDouble()*100);
        }
        while(priorityQueue.peek() != null){
            System.out.println(priorityQueue.poll());
        }
    }

}
