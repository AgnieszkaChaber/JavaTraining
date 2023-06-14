package main.java.A_methods;

public class Method3 {

    public static double convertToUsd (double pln) {
        //Jako przelicznik 1 USD = 4.20 PLN
        double usd = pln /4.20;
        return usd;
    }

    public static void main(String[] args) {
        double a = 8.40;
        double check = convertToUsd(a);
        System.out.println(check);
    }
}
