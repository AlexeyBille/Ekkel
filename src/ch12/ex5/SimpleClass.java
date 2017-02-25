package ch12.ex5;

public class SimpleClass {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int i = -10;
        System.out.println("Start while");
        while(true){
            try {
                arr[i] = 1;
                break;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Exeption " + i);
                i++;
            }

        }
        System.out.println("End while");
    }
}
