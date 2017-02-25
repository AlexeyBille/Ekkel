package test;

public class Child extends Parent {
    @Override
    void hello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Child child = new Child();
        Parent p = child;
        Child2 child2 = p instanceof Child2 ? ((Child2) p) : null;
    }
}
