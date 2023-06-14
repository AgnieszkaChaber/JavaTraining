package main.java.F_inheritance;

public class Shape_Test {
    public static void main(String[] args) {
    Shape square = new Shape(2, 3, "red");
    Shape square2 = new Shape(5, 8, "white");
    System.out.println(square.getDescription());
    System.out.println(square2.getDescription());
    square.getDistance(square);
    square.getDistance(square2);
    square2.getDistance(square);
    }
}
