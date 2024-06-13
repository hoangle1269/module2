package entity;

public class Rectangle extends GeometricObject {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 2.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    protected double getArea() {
        return width * length;
    }

    protected double getPerimeter() {
        return 2 * width * length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + this.width + " and length = " + this.length + " which is a subclass of " + super.toString();
    }
}
