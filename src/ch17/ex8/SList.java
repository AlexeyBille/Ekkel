package ch17.ex8;

import java.util.Collection;

public class SList<T> {

    SList(){

    }

    Link<T> firstLink = new Link<T>();

    static class Link<T>{

        public Link(T t) {
            this.t = t;
        }

        Link<T> nextLink;
        T t;

        public Link() {

        }
    }
    SListIterator iterator(){
        return new SListIterator(firstLink);
    }

    @Override
    public String toString() {
        String out = "[";

        SListIterator iterator = iterator();
        while (iterator.hasNext()){
            out += iterator.next() + ",";
        }
        out = out.substring(0,out.length()-1) +  "]";
        return out;

    }
}
