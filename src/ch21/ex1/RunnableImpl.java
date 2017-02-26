package ch21.ex1;

public class RunnableImpl implements Runnable {
    public static int temp = 0;
    public final int id = ++temp;
    RunnableImpl(){
        System.out.println("Constructor " + id);
    }
    @Override
    public void run() {
        System.out.println("Message 1, id = " + id);
        Thread.yield();

        System.out.println("Message 2, id = " + id);
        Thread.yield();

        System.out.println("Message 2, id = " + id);
        Thread.yield();

        System.out.println("End of the thread");

    }
}
