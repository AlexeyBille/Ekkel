package ch21.ex10;

import java.util.ArrayList;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Future<ArrayList<Long>>> list = new ArrayList<>();
        Fib f = new Fib();

        list.add(f.runTask(10));
        list.add(f.runTask(20));
        list.add(f.runTask(30));
        list.add(f.runTask(40));
        for(Future<ArrayList<Long>> future: list) {
            ArrayList<Long> temp = future.get();

            for( Long j : temp) {
                System.out.println(j);
            }
        }
    }
}
