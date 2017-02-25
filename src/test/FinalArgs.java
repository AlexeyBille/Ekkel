package test;

public class FinalArgs {
    public static void main(String[] args) {
        qwe(10);

    }
    public static void qwe(final Integer integer) {
        Integer i = integer;
        System.out.println(integer);
        System.out.println(i);
        i = 15;
        System.out.println(integer);
        System.out.println(i);

    }
}
