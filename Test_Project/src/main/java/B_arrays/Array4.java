package main.java.B_arrays;

import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reverse =new int [10];
        int n = numbers.length;
        for(int i=0; i < numbers.length; i++) {
            reverse[i] = numbers[n-i-1] ;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(reverse));
    }
}
