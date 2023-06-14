package main.java.F_inheritance;

public class Circle extends Shape {
    private int radius;
    double PI = 3.14;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public String getDescription() {
        return "x = " + x + " y = " + y + " radius = " + radius + " color = " + color;
    }

    void getArea() {
        double result = PI * Math.pow(radius, 2);
        System.out.println(result);
    }

    void getCircuit(){
        double result = 2 * PI * radius;
        System.out.println(result);
    }
}
