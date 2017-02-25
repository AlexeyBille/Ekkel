package ch15.ex2;

import java.util.LinkedList;
import java.util.List;

public class Holder<T> {
    T t1;
    T t2;
    T t3;
    Holder(T t1, T t2, T t3){
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public T getT1() {
        return t1;
    }

    public T getT2() {
        return t2;
    }

    public T getT3() {
        return t3;
    }

    public void setT1(T t1) {
        this.t1 = t1;
    }

    public void setT2(T t2) {
        this.t2 = t2;
    }

    public void setT3(T t3) {
        this.t3 = t3;
    }

    public static void main(String[] args) {
        Holder<String> stringHolder = new Holder<>("T1","T2","T3");
    }

    public <T> void linkedList(LinkedList<T> linkedList){

    }

    public <T> void list(List<T> list){

    }

    public <T> void qwe(T t){

    }

}
