package ch10.Habr.ex1;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner  inner = outer.getInner();
        Outer.Inner inner1 = new Outer.Inner();
        Outer.Inner inner2 = new Outer.Inner();
    }
}
