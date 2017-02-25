package ch10.Habr.ex1;

public class Outer implements Inter{
    static class Inner{

    }
    Inner getInner(){
        return new Inner();
    }
}
