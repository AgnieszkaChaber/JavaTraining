package main.java.A_methods;

public class Method5 {

    public static double calculateNetto (double gross, double vat) {
    double netto = gross/(1+vat);
    return  netto;
    }

    public static void main(String[] args) {
        double testGross = 7.65;
        double testVat = 0.23;
        double check = calculateNetto(testGross, testVat);
        System.out.println(check);
    }
}
