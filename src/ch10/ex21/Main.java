package ch10.ex21;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<A> list = new ArrayList<>();
        B b = new B();
        for(int i = 0; i < 10;i++){
            list.add(new A());
        }
        for(A i:list){
            for(int j = 0; j < 10;j++){
                b.add(i.getU());
            }
        }
        b.callMethods();
    }
}
