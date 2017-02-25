package ch16.ex20;

import java.util.Arrays;

public class TwoDEqualsArrays {
    public static void main(String[] args) {
        String[][] s1 = new String[5][5];
        String[][] s2 = new String[5][5];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                s1[i][j] = new String("hello");
                s2[i][j] = new String("hello");
            }
        }
        System.out.println(Arrays.deepEquals(s1,s2));


    }
}
