package ch11.ex4;

import java.util.*;

public class Generator {
    private String[] arr = {"Batman","Superman","Rassomaha","Alexey","Igor","Alexander"};
    private int i = 0;
    String next(){
        if(i==arr.length) {
            i %= arr.length;
        }
        return arr[i++];
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        Generator generator = new Generator();
        for(int j = 0; j < 40;j++){
            String next = generator.next();
            arrayList.add(next);
            linkedList.add(next);
            hashSet.add(next);
            linkedHashSet.add(next);
            treeSet.add(next);
        }
        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}
