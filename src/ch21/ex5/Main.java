package ch21.ex5;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<ArrayList<Long>>> list = new ArrayList<>();

        list.add(executorService.submit(new Fib(10)));
        list.add(executorService.submit(new Fib(20)));
        list.add(executorService.submit(new Fib(30)));
        list.add(executorService.submit(new Fib(40)));
        for(Future<ArrayList<Long>> future: list) {
            ArrayList<Long> temp = future.get();

            for( Long j : temp) {
                System.out.println(j);
            }
        }

    }
}
