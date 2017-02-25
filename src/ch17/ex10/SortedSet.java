package ch17.ex10;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SortedSet<T extends Comparable> implements Iterable<T> {
    private List<T> list = new LinkedList<T>();

    void add(T t) {
        if(list.indexOf(t) < 0){
            list.add(t);
            Collections.sort(list);
        }

    }

    void remove(T t) {
        list.remove(t);
    }

    public Iterator iterator() {
        return list.iterator();
    }
}
