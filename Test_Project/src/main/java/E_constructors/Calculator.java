package main.java.E_constructors;

import java.util.Arrays;

public class Calculator {
    String[] operations;

    public Calculator() {
        this.operations = new String[0];
    }

    private void addOperation(String o) {
        this.operations = Arrays.copyOf(this.operations, this.operations.length + 1);
        this.operations[this.operations.length - 1] = o;
    }

    public void printOperations() {
        for (String o : operations) {
            System.out.println(o);
        }
    }

    void clearOperations() {
        this.operations = new String[0];
    }

    double add(double num1, double num2) {
        double result = num1 + num2;
        addOperation("added " + num1 + " to " + num2 + " got " + result);
        return result;
    }

    double multiply(double num1, double num2) {
        double result = num1 * num2;
        addOperation("multiplied " + num1 + " with " + num2 + " got " + result);
        return result;
    }

    double substract(double num1, double num2) {
        double result = num1 - num2;
        addOperation("substracted " + num1 + " from " + num2 + " got " + result);
        return result;
    }

    double divide(double num1, double num2) {
        double result = num1 / num2;
        addOperation("divided " + num1 + " by " + num2 + " got " + result);
        return result;
    }
}
