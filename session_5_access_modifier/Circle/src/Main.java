public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Circle c1 = new Circle();
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        Circle c2 = new Circle(10, "white");
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Color: " + c2.getColor());
        System.out.println("Area: " + c2.getArea());
        System.out.println("Perimeter: " + c2.getPerimeter());

    }
}