package ch10.ex1;

public class Outer {
    private String string = "";
    Outer(String string){
        this.string = string;
    }
    class Inner{
        @Override
        public String toString() {
            return string;
        }
    }
    Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer("hello");
        Inner inner1 = outer.getInner();
        Inner inner2 = outer.getInner();
        Inner inner3 = outer.getInner();
        System.out.println(inner1+" "+inner2+" "+inner3);
    }
}
