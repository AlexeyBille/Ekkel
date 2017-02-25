package ch18.ex7;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));
        String s = "";
        LinkedList<String> list = new LinkedList<>();
        while ((s=reader.readLine()) != null ) {
            list.add(s.toUpperCase());
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
