abstract class ShapeDemo {
    protected int dimension1;
    protected int dimension2;

    public ShapeDemo(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public abstract void calArea();
}

class Rectangle extends ShapeDemo {
    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    public void calArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of rectangle is " + area);
    }
}

class Triangle extends ShapeDemo {
    public Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    public void calArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of triangle is " + area);
    }
}

public class ShapeDemoMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 6);
        Triangle triangle = new Triangle(2, 8);

        rectangle.calArea();
        triangle.calArea();
    }
}
