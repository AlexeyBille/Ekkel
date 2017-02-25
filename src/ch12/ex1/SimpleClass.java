package ch12.ex1;

public class SimpleClass {
    public static void main(String[] args) {
        try{
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("hello");
        } finally {
            System.out.println("finally");
        }
        System.out.println("IMA HERE");
    }
}
