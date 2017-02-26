package ch21.ex14;

import java.util.Timer;
import java.util.TimerTask;

public class Timerex {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i ++){
            int finalI = i;
            Timer t = new Timer();
            t.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println(finalI + ": hello world");
                    t.cancel();
                }
            },300*i);
        }
    }
}
