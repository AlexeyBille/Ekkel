package ch10.ex10;

public class Outer {
    private class Inner implements Interface {

    }
    Interface method(){
        return new Inner();
    }
}
