package ch11.Test;

import java.util.ArrayList;
import java.util.Random;

public class SimpleClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for(int i = 0; i < 30; i++){
            list.add(rnd.nextInt(99));

        }
        for(int i:list){
            System.out.println(i);
        }
    }
}
