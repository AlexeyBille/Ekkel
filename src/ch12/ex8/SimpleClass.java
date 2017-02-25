package ch12.ex8;

import ch12.ex4.ExceptionImpl;

public class SimpleClass {
    void method() throws ExceptionImpl {
        throw new ExceptionImpl();
    }
    public static void main(String[] args) {
        try {
            new SimpleClass().method();
        } catch (ExceptionImpl exception) {
            exception.printStackTrace();
        }
    }
}
