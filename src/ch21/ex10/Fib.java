package ch21.ex10;

import java.util.ArrayList;
import java.util.concurrent.*;

class Fib {

    private int count = 10;
    private Callable<ArrayList<Long>> t;

    Future<ArrayList<Long>> runTask(final int count) throws Exception {
        t = () -> {
            ArrayList<Long> list = new ArrayList<>();
            long prevNumber = 1;
            long curNumber = 1;
            list.add(1L);
            list.add(1L);
            for (int i = 2; i < count; i++) {
                long temp = curNumber + prevNumber;
                prevNumber = curNumber;
                curNumber = temp;
                list.add(curNumber);
            }

            return list;
        };
        return Executors.newSingleThreadExecutor().submit(t);

    }
}
