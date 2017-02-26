package ch21.ex11;

import java.util.concurrent.TimeUnit;

public class SimpleClass implements Runnable {

    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;

    synchronized void method1(){
        ++i1;
        ++i2;
        ++i3;
        ++i4;
    }

    synchronized void method2(){
        ++i1;
        ++i2;
        ++i3;
        ++i4;
    }

    @Override
    synchronized public String toString() {
        return i1 + " " + i2 + " " + i3 + " " + i4;
    }

    @Override
    public void run() {
        while (true) {
            method1();
            method2();
            System.out.println(toString());
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
