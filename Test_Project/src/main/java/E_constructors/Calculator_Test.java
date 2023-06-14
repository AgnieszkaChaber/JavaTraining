package main.java.E_constructors;

public class Calculator_Test {
    public static void main(String[] args) {
        Calculator testCalculator = new Calculator();
        testCalculator.add(17.1, 23.9);
        testCalculator.multiply(3, 10);
        testCalculator.printOperations();
        testCalculator.clearOperations();
        testCalculator.printOperations();
        testCalculator.substract(170, -50);
        testCalculator.printOperations();
    }
}
