package ch10.ex19;

public class Impl implements Interface {
    @Override
    public String getString() {
        return "Hello";
    }

    public static void main(String[] args) {
        Interface.Inner.method(new Impl());
    }
}
