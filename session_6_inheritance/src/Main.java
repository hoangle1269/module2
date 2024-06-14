import entity.*;

import java.util.Comparator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Create some Rectangle objects
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(3.0, 4.0);
        Rectangle rectangle3 = new Rectangle(5.0, 6.0, "red", false);

        System.out.println("Before: " + rectangle1);

        rectangle1.resize(50);
        rectangle1.howToColor();

        // Print information about rectangles
        System.out.println("After :" + rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);

        // Create some Circle objects
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.0);
        Circle circle3 = new Circle(3.0, "blue", true);

        circle1.resize(100);

        // Print information about circles
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        // Create some Square objects
        Square square1 = new Square();
        Square square2 = new Square(4.0);
        Square square3 = new Square(5.0, "yellow", true);

        square1.resize(200);

        // Print information about squares
        System.out.println(square1);
        System.out.println(square2);
        System.out.println(square3);

        // Create some Cylinder objects
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(2.0, 5.0);
        Cylinder cylinder3 = new Cylinder(3.0, 7.0, "green", false);

        // Print information about cylinders
        System.out.println(cylinder1);
        System.out.println(cylinder2);
        System.out.println(cylinder3);

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(5.0, 5.0, 5.0);
        Triangle triangle3 = new Triangle("red", true, 7.0, 7.0, 7.0);

        System.out.println(triangle1);
        System.out.println(triangle2);
        System.out.println(triangle3);

        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        //Arrays.sort(circles);
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        GeometricObject[] shapes = new GeometricObject[4];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Square(7);
        shapes[3] = new Square(4); // Thêm một Square khác

        for (GeometricObject shape : shapes) {
            // Hiển thị diện tích của hình
            double area = shape.getArea();
            System.out.println(shape);
            System.out.println("Area: " + area);

            // Nếu shape là Colorable, gọi phương thức howToColor
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }

    }


}

