package ch15.ex28;

public class Generic2<T> {

    T t;

    Generic2(T t) {
        this.t = t;
    }

    public T method1() {
        return t;
    }
}
