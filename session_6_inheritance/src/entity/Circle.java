package entity;

public class Circle extends GeometricObject implements Resizable, Colorable {
    public double radius;

    public Circle() {
        super();
        this.radius = 1;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
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
        return 2 * Math.PI * radius;
    }

    protected double getPerimeter() {
        return Math.PI * Math.pow(radius, 2);
    }

    protected double getDiameter() {
        return 2 * radius;
    }

    protected void printCircle() {
        System.out.println("The circle is created on " + getDateCreated() + " and the radius is " + radius);
    }

    @Override
    public void resize(double percent) {
        radius += radius * percent / 100;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + this.radius + " which is a subclass of " + super.toString();
    }


}
