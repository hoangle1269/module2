package entity;

public class Rectangle extends GeometricObject implements Resizable, Colorable {
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

    public double getArea() {
        return width * length;
    }

    protected double getPerimeter() {
        return 2 * width * length;
    }

    @Override
    public void resize(double percent) {
        width += width * percent / 100;
        length += length * percent / 100;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + this.width + " and length = " + this.length + " which is a subclass of " + super.toString();
    }
}
