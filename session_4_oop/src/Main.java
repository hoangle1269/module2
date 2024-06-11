import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        double width = scanner.nextDouble();

        System.out.println("Enter height: ");
        double height = scanner.nextDouble();

        // Create a Rectangle object with the input width and height
        Rectangle hinhchunhat = new Rectangle(width, height);

        // Display the rectangle's information, area, and perimeter
        System.out.println("Rectangle Details: \n" + hinhchunhat.display());
        System.out.println("Area: " + hinhchunhat.getArea());
        System.out.println("Perimeter: " + hinhchunhat.getPerimeter());
    }
}
