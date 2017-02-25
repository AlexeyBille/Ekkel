package ch16.ex22;

import java.util.Arrays;
import java.util.Random;

public class BinaryNotSortedSearch {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random rnd = new Random(48);
        for(int i = 0; i < 20; i++) {
            arr[i] = rnd.nextInt(20);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,2));

    }
}
