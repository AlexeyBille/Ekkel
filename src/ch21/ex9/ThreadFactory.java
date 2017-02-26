package ch21.ex9;

import java.util.Random;
import java.util.concurrent.ThreadFactory;

class PriorityThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable runnable) {
        Random random = new Random();
        Thread thread = new Thread(runnable);
        int i = random.nextInt(9)+1;
        System.out.println(i);
        thread.setPriority(i);
        return thread;
    }
}
