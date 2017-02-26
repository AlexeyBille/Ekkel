package ch21.ex5;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Fib implements Callable<ArrayList<Long>> {
    static int temp = 0;
    private final int id = ++temp;

    private int number = 0;

    Fib(int n) {
        this.number = n;
    }

    ArrayList<Long> list = new ArrayList<>();

    void fib(int n) {

        long prevnumber = 1;
        long curnumber = 1;
        list.add(1L);
        list.add(1L);
        for (int i = 2; i < n; i++) {
            long temp = curnumber + prevnumber;
            prevnumber = curnumber;
            curnumber = temp;
            list.add(curnumber);
        }

    }

    @Override
    public ArrayList<Long> call() throws Exception {
        fib(number);
        return list;
    }
}
