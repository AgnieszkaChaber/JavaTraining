package main.java.F_inheritance;

public class SalariedEmployee extends Employee{

    private static final int WORKING_HOURS_PER_MONTH = 240;

    public SalariedEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    public void calculatePayment(){
        double result = WORKING_HOURS_PER_MONTH * wage;
        System.out.println("Calculated payment: " + result);
    }
}
