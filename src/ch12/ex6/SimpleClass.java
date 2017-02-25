package ch12.ex6;

public class SimpleClass {
    public static void main(String[] args) {
        try{
            throw new ExceptionImpl1();
        } catch (ExceptionImpl1 exceptionImpl1) {

        }
        try{
            throw new ExceptionImpl2();
        } catch (ExceptionImpl2 exceptionImpl2) {

        }
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
    }
}
