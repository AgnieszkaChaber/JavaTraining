package main.java.A_methods;

public class Method6 {

    public static String checkMaturity (int age){
        String maturity;
        if (age < 18){
            maturity = "false";
        }
        else {
            maturity = "true";
        }
        return maturity;
    }

    public static void main(String[] args) {
        int michaelAge = 7;
        int saraAge = 90;
        String check1 = checkMaturity (michaelAge);
        String check2 = checkMaturity (saraAge);
        System.out.println("Michael is mature: " + check1);
        System.out.println("Sara is mature: " + check2);
    }
}
