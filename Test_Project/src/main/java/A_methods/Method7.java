package main.java.A_methods;

public class Method7 {
    public static String checkEvenOdd (int number){
        String status;
        if (number%2 == 0){
            status = "even";
        }
        else {
            status ="odd";
        }
        return status;
    }

    public static void main(String[] args) {
        int a = 4;
        int b =701;
        System.out.println(a + " is " + checkEvenOdd(a) + " number");
        System.out.println(b + " is " + checkEvenOdd(b) + " number");
    }
}
