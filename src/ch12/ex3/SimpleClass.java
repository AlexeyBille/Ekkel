package ch12.ex3;

public class SimpleClass {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[1] = 1;
            arr[-1] = 2;
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("Hello");
    }
}
