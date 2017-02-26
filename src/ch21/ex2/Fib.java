package ch21.ex2;

public class Fib implements Runnable {
    static int temp = 0;
    private final int id = ++temp;

    private int number = 0;

    Fib(int n) {
        this.number = n;
    }


    @Override
    public void run() {
        fib(number);
    }

    void fib(int n) {

        long prevnumber = 1;
        long curnumber = 1;
        System.out.println(id + " #" + 1 + " : " + 1);
        System.out.println(id + " #" + 2 + " : " + 1);
        for (int i = 2; i < n; i++) {

            long temp = curnumber + prevnumber;
            prevnumber = curnumber;
            curnumber = temp;

            System.out.println(id + " #" + (i + 1) + " : " + curnumber);
        }

    }
}
