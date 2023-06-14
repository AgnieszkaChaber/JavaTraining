package main.java.F_inheritance;

public class Shape {
    public int x;
    public int y;
    public String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getDescription() {
        return "x = " + x + " y = " + y + " color = " + color;
    }

    void getDistance(Shape shape) {
        double odcinek1 = this.x - shape.x;
        double odcinek2 = this.y - shape.y;
        double result = Math.sqrt(Math.pow(odcinek1, 2) + Math.pow((odcinek2), 2));
        System.out.println(result);
    }

}
