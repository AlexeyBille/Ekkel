package ch16.ex23;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class integerReverseSort {
    public static void main(String[] args) {
        Integer[] integers = new Integer[10];

        Random rnd = new Random(54);

        for(int i = 0; i < 10; i++) {
            integers[i] = rnd.nextInt(20);
        }
        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers, Collections.reverseOrder());
        System.out.println(Arrays.toString(integers));
    }
}
