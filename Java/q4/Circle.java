package Java.q4;

public class Circle extends GeometricObject {
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle(String args[]) {
        System.out.println("Circle Radius is :" + this.radius);
    }


}
