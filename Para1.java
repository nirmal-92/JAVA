// Define the Shape class
class Shape {
    public double getArea() {
        return 0.0;
    }
}

// Define the Rectangle class, a subclass of Shape
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
}

public class Para1 {
    public static void main(String[] args) {
        Shape genericShape = new Shape();
        Rectangle myRectangle = new Rectangle(5.0, 3.0);
        double genericArea = genericShape.getArea();
        double rectangleArea = myRectangle.getArea();
        
        System.out.println("Area of the generic shape: " + genericArea);
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}
