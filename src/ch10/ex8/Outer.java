package ch10.ex8;

public class Outer {
    class Inner{
        private String string = "private";

    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.string = "public";
    }
}
