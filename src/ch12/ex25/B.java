package ch12.ex25;

public class B extends A {
    @Override
    void method() throws ExceptionB {
        throw new ExceptionB();
    }
}
