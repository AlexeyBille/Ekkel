package ch21.ex1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main start");
        for(int i = 0; i < 5;i++){
            new Thread(new RunnableImpl()).start();
        }
        System.out.println("Main end");
    }
}
