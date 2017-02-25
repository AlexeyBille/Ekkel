package ch12.ex25;

public class Main {
    public static void main(String[] args) {
        A a = new C();
        try {
            a.method();
        } catch (ExceptionA exceptionA) {
            exceptionA.printStackTrace();
        }
    }
}
