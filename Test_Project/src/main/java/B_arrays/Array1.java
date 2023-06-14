package main.java.B_arrays;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
    int [] mainTab = new int [50];
        for (int i = 0; i < 50; i++) {
            mainTab[i] = i;
        }
        Arrays.toString(mainTab);
        for (int z = 0; z < 5; z++ ){
            for ( int y = 0; y < 10; y ++){
                if (z == 0) {
                    System.out.print("0"+mainTab[y] +", " );
                }
                else {
                    System.out.print(mainTab[(10*z)+y] +", " );
                }
            }
            System.out.println();
        }
 ;
    }
}
