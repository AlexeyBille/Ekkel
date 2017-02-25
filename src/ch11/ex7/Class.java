package ch11.ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class {
    public static void main(String[] args) {
        Class[] classes = {new Class(),new Class(),new Class(),new Class(),new Class(),new Class(),new Class(),new Class(),new Class(),new Class(),new Class()};
        List<Class> list = new ArrayList<>();

        Collections.addAll(list, classes);
        System.out.println(list);
        List<Class> subList = list.subList(0,3);
        list.removeAll(subList);
        System.out.println(list);

    }
}
