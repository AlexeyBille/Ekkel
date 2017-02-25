package ch12.ex4;

public class SimpleClass {
    public static void main(String[] args) {
        try {
            throw new ExceptionImpl("TRY CATCH");

        } catch (ExceptionImpl exception) {
            exception.print();
        }
    }
}
