package ch14.ex6;

public class ThirdClass extends SecondClass {
    public static void main(String[] args) {
        Class c = ThirdClass.class;
        while(c != null){
            System.out.println(c.getSimpleName());
            System.out.println(c.getDeclaredFields());
            c = c.getSuperclass();
        }
    }
}
