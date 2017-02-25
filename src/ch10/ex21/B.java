package ch10.ex21;

import java.util.ArrayList;

public class B {
    private ArrayList<U> list = new ArrayList<>();
    void add(U u){
        System.out.println("U added");
        list.add(u);
    }
    void remove(U u){
        System.out.println("U removed");
        list.remove(u);
    }
    void callMethods(){
        System.out.println("Start calling");
        for(U i:list){
            i.method1();
            i.method2();
            i.method3();
        }
    }
}
