package ch15.ex20;

public class Main {
    public static void main(String[] args) {
        intImpl i = new intImpl();
        AnotherClass anotherClass = new AnotherClass();
        anotherClass.method1(i);
    }
}
