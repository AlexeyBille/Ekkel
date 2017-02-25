package ch10.ex19;

public interface Interface {
    String getString();
    class Inner{
        static void method(Interface i){
            System.out.println(i.getString());
        }
    }
}
