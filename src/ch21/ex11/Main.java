package ch21.ex11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        SimpleClass simpleClass = new SimpleClass();
        for( int i = 0 ; i < 10; i++){
            executorService.submit(simpleClass);
        }
    }
}
