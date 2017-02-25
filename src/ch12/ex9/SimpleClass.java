package ch12.ex9;

public class SimpleClass {
    void f(){
        try {
            g();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("finnaly");
        }

    }
    void g() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        new SimpleClass().f();
    }
}
