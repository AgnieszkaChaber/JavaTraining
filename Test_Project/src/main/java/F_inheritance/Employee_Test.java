package main.java.F_inheritance;

public class Employee_Test {
    public static void main(String[] args) {
        Employee Adam = new Employee(1011, "Adam", "Smith", 20);
        Adam.raiseWage(10);
        System.out.println(Adam.wage);
        Adam.raiseWage(0);
    }
}
