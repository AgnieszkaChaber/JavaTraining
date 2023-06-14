package main.java.A_methods;

public class Method9 {

    public static int factorial(int n) {
        int z = 1;
        while (n > 0) {
            z *= n;
            n = n - 1;
        }
        return z;
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorial(6));
    }
}
