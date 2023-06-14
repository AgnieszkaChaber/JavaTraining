package main.java.A_methods;

public class Method1 {
    public static int multiply (int multiplier, int index) {
        return multiplier * index;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 10;
        int check = multiply(a, b);
        System.out.println(check);
    }

}
