package main.java.B_arrays;

import java.util.Arrays;
import java.util.Random;

public class Array2 {
    public static void main(String[] args) {
        int[] randNumbers = new int [20];
        Random r = new Random();
        for(int i=0; i < randNumbers.length; i++) {
            randNumbers[i] = r.nextInt(100);
        }
        int min = randNumbers[0];
        for (int i=1; i < randNumbers.length; i++){
            if (min > randNumbers[i]){
                min = randNumbers [i];
            }
        }
            System.out.println(Arrays.toString(randNumbers));
            System.out.println("Minimum value from the array: " + min);
    }
}
