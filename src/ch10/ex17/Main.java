package ch10.ex17;

public class Main {
    public static void main(String[] args) {
        SimpleOuter simpleOuter = new SimpleOuter();
        SimpleOuter.SimpleInner1 simpleInner1 = simpleOuter.new SimpleInner1();
        SimpleOuter.SimpleInner1.SimpleInner2 simpleInner2 = simpleInner1.new SimpleInner2();

        StaticOuter.StaticInner1.StaticInner2 staticObject = new StaticOuter.StaticInner1.StaticInner2();
    }
}
