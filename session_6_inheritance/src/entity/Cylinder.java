package entity;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        double height = 0.1;
    }

    public Cylinder(double height, double radius) {
        super(radius);  // Calls the constructor of Circle with radius
        this.height = height;
    }

    public Cylinder(double height, double radius, String color, boolean filled) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
