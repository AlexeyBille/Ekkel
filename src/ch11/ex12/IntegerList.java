package ch11.ex12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class IntegerList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for(int i = 0;i<20;i++){
            list.add(rnd.nextInt());
        }
        List<Integer> reverseList = new ArrayList<>();
        ListIterator<Integer> listIterator = list.listIterator(list.size());
        for(int i = 0; i < 20; i++){
            reverseList.add(listIterator.previous());
        }
        System.out.println(list);
        System.out.println(reverseList);
    }
}
