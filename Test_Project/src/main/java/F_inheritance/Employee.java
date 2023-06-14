package main.java.F_inheritance;

public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public double wage;

    public Employee(int id, String firstName, String lastName, double wage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
    }

    void raiseWage(int percent) {
        if (percent > 0) {
            wage = wage + 0.01 * percent * wage;
        } else {
            System.out.println("Wage doesn't change.");
        }
    }
}
