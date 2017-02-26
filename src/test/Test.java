package test;

import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"q");
        treeMap.put(2,"w");
        treeMap.put(3,"e");

        for(Map.Entry<Integer,String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " , " + entry.getValue() );
        }
    }

}
