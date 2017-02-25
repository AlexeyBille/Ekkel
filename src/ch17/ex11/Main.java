package ch17.ex11;

import java.util.PriorityQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<IntegerQueue> queue = new PriorityQueue();


        Random rnd = new Random();

        for (int i = 0; i < 100; i++){
            queue.add(new IntegerQueue(rnd.nextInt(100)));
        }

        for(IntegerQueue i : queue) {
            System.out.println(i);
        }
    }
}
