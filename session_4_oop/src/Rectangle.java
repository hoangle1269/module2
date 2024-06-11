public class Rectangle {

    double width, height;

    // Default constructor (constructor khong co tham so)
    public Rectangle() {
    }

    // Constructor with parameters
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area
    public double getArea() {
        return this.width * this.height;
    }

    // Method to calculate the perimeter
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    // Method to display the rectangle's dimensions
    public String display() {
        return "Rectangle [width = " + width + ", height = " + height + "]";
    }
}
