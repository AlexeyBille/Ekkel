package ch21.ex6;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Counter implements Runnable {

    static int temp = 0;
    private final int id = ++temp;


    @Override
    public void run() {
        Random rnd = new Random();
        Long n = new Date().getTime();
        try {
            TimeUnit.SECONDS.sleep(rnd.nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Long ne = new Date().getTime();

        System.out.println(id + " : " + (ne - n));

    }
}
