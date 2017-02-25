package ch12.ex2;

public class SimpleClass {
    public static void main(String[] args) {
        try {
            Object object = null;
            object.toString();
        } catch (NullPointerException e){
            System.err.println("Err " + e);
        }
    }
}
