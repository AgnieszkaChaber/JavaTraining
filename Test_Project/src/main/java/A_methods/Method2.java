package main.java.A_methods;

public class Method2 {

    public static int square (int num) {
        int squareOfNum = num * num;
        return squareOfNum;
    }

    public static void main(String[] args) {
        int a = 5;
        int check = square (a);
        System.out.println(check);
    }
}
