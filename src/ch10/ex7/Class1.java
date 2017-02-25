package ch10.ex7;

class Outer {
    private String str = "";
    private void method(){
        System.out.println(str);
    }
    class Inner{
        void innerMethod(){
            str = String.valueOf(Math.random());
            method();
        }
    }
    void outerMethod(){
        Inner inner = new Inner();
        inner.innerMethod();
    }


}
