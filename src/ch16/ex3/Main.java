package ch16.ex3;

import java.util.Random;

public class Main {
    static double[][] generateDoubleArray(int h, int w, double rangeMin, double rangeMax){
        double[][] arr = new double[h][w];
        Random rnd = new Random();
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                    arr[i][j] = rangeMin + (rangeMax - rangeMin) * rnd.nextDouble();
            }
        }
        return arr;
    }

    static void showArr(double[][] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.print(i+": ");
            for(int j = 0; j < arr[i].length;j++){
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] arr = generateDoubleArray(5,5,1,10);
        showArr(arr);
    }

}
