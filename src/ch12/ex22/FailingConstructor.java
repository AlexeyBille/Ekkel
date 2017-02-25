package ch12.ex22;

public class FailingConstructor {
    DisposeClass disposeClass1;
    DisposeClass disposeClass2;
    FailingConstructor() throws Exception {
        disposeClass1 = new DisposeClass();
        try {
            throw new Exception();
        } catch (Exception e){
            System.err.println("catch");
        }

        disposeClass2 = new DisposeClass();
        disposeClass2.dispose();
    }

    public static void main(String[] args) {
        try {
            FailingConstructor failingConstructor = new FailingConstructor();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
