package main.java.F_inheritance;

public class AdvancedCalculator extends Calculator {

    public AdvancedCalculator() {
        super();
    }

    double pow(double num1, double num2) {
        double result = Math.pow(num1, num2);
        addOperation(num1 + " ^ " + num2 + " equals " + result);
        return result;
    }

    double root(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot calculate the root with zero as the degree.");
            return 0;
        }
        double result = Math.pow(num1, 1 / num2);
        addOperation(num2 + " root of " + num1 + " equals " + result);
        return result;
    }
}
