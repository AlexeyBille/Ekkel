package ch17.ex11;

public class IntegerQueue implements Comparable {
    Integer integer;

    public IntegerQueue(Integer integer) {
        this.integer = integer;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof IntegerQueue) {
            IntegerQueue t = (IntegerQueue) o;
            if (integer > t.integer) {
                return 1;
            } else if (integer < t.integer) {
                return -1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "IntegerQueue{" +
                "integer=" + integer +
                "}\n";
    }
}
