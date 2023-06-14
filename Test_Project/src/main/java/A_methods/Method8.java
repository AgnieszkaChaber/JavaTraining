package main.java.A_methods;

public class Method8 {

    public static int maxOfThree (int number1, int number2, int number3) {
        int max = number1;
        if (max < number2) {
            max = number2;
        }
        if (max < number3){
            max = number3;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxOfThree(1, 3, 5));
        System.out.println(maxOfThree(5, 1, 3));
        System.out.println(maxOfThree(3, 1, 5));
        System.out.println(maxOfThree(1, 1, 7));
    }


}
