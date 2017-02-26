package ch21.ex6;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            Thread thread = new Thread(new Counter());
            thread.setDaemon(true);
            thread.start();
        }
        TimeUnit.MICROSECONDS.sleep(10000000L);
    }
}
