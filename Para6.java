import java.lang.Math;
class Shape {
    public double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
}
class Triangle extends Shape {
    private double base;
    private double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Para6 {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);
        Rectangle myRectangle = new Rectangle(4.0, 6.0);
        Triangle myTriangle = new Triangle(3.0, 8.0);
        System.out.println("Area of the Circle: " + myCircle.calculateArea()); 
        System.out.println("Area of the Rectangle: " + myRectangle.calculateArea()); 
        System.out.println("Area of the Triangle: " + myTriangle.calculateArea()); 
    }
}
