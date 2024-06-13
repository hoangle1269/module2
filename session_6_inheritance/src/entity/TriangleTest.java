package entity;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input sides");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        scanner.nextLine();  // Consume newline left by nextDouble()

        System.out.println("Input color: ");
        String color = scanner.nextLine();

        Triangle triangleTest = new Triangle(color, true, side1, side2, side3);

        System.out.println("The sizes of the triangle are " + side1 + ", " + side2 + ", " + side3);
        System.out.println("The color is: " + color);
        System.out.println("The area is: " + triangleTest.getArea() + " the perimeter is: " + triangleTest.getPerimeter());

        scanner.close(); // close so that the Scanner(System.in) wont scan somewhere else and create trouble!!!
    }
}
