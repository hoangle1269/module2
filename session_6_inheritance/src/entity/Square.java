package entity;

public class Square extends Rectangle implements Resizable, Colorable {

    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);  // Call the parent constructor with width and length equal to side
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side); // Ensure both width and length are set to the same value
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side); // Ensure both length and width are set to the same value
    }

    @Override
    public double getArea() {
        double side = getWidth(); // or getLength(), both are the same
        return side * side;
    }

    @Override
    public double getPerimeter() {
        double side = getWidth(); // or getLength(), both are the same
        return 4 * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "A Square with side = " + getWidth() + ", which is a subclass of " + super.toString();
    }
}
