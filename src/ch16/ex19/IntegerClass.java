package ch16.ex19;

import java.util.Arrays;

public class IntegerClass {
    int i;

    public IntegerClass(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        IntegerClass[] integerClasses1 = new IntegerClass[10];
        Arrays.fill(integerClasses1,new IntegerClass(1));

        IntegerClass[] integerClasses2 = new IntegerClass[10];
        Arrays.fill(integerClasses2,new IntegerClass(1));

    }

    @Override
    public String toString() {
        return "IntegerClass{" +
                "i=" + i +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntegerClass that = (IntegerClass) o;

        return i == that.i;
    }

    @Override
    public int hashCode() {
        return i;
    }
}
