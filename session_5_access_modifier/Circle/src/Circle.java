public class Circle {
    private double radius;
    private String color;

    private Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    private Circle() { // ko tham so thi de san gia tri
        this.radius = 1.0;
        this.color = "red";
    }

    private double getRadius() {
        return radius;
    }

    private String getColor() {
        return color;
    }

    private double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    private double getPerimeter() {
        return Math.PI * 2 * radius;
    }
}
