package main.java.F_inheritance;

public class HourlyEmployee extends Employee{

    public HourlyEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    public void calculatePayment(int hours){
        double result = hours * wage;
        System.out.println("Calculated payment: " + result);
    }
}
