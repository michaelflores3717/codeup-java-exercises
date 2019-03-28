package shapes;

public class Circle {
    private double radius;
    private static double pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(double radius){
        double area = 2 * pi * radius;
        return area;
    }

    public double getCircumference(double radius) {
        double circumference = pi * (radius * radius);
        return circumference;
    }

    public double getRadius() {
        return radius;
    }
}
