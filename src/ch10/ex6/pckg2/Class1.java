package ch10.ex6.pckg2;

import ch10.ex6.pckg1.Int1;

public class Class1 {
    protected class Int1Impl implements Int1{

        @Override
        public void sayhello() {
            System.out.println("hello impl1");
        }
    }
}
