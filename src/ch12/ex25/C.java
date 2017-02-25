package ch12.ex25;

public class C extends B {
    @Override
    void method() throws ExceptionC {
        throw new ExceptionC();
    }
}
