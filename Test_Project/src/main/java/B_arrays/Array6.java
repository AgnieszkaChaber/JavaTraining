package main.java.B_arrays;

import java.util.Arrays;
import java.util.Random;

public class Array6 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] secondNumbers = new int[10];
        int[] sum = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            numbers[i] = r.nextInt(100);
            secondNumbers[i] = r.nextInt(100);
            sum[i] = numbers[i] + secondNumbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(secondNumbers));
        System.out.println(Arrays.toString(sum));
    }
}
