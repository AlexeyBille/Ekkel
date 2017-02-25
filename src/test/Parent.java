package test;

import java.io.Serializable;

public class Parent implements Serializable {
    public int i = 190;
    void hello(){
        System.out.println("Parent");
    }

    @Override
    public String toString() {
        return "Parent{" +
                "i=" + i +
                '}';
    }
}
