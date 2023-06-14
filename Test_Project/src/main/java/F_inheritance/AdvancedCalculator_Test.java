package main.java.F_inheritance;

public class AdvancedCalculator_Test {
    public static void main(String[] args) {
        AdvancedCalculator testCalculator = new AdvancedCalculator();
        testCalculator.pow(7, 2);
        testCalculator.root(4, 0);
        testCalculator.root(-4, 0);
        testCalculator.root(4, 2);
        testCalculator.printOperations();
    }
}
