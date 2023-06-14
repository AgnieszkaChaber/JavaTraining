package main.java.D_oop_methods;

public class Car_Test {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("Volkswagen");
        myCar.setModel("Golf");
        myCar.setPrice(3700.50);
        System.out.println(myCar.toString());
    }
}
