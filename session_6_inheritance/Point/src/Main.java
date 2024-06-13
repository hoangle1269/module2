public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Create default Point object
        Point p1 = new Point();
        System.out.println("Default point: " + p1);

        // Create a Point object with specified coordinates
        Point p2 = new Point(3.5f, 7.2f);
        System.out.println("Point with coordinates (3.5, 7.2): " + p2);

        // Set coordinates for the default point
        p1.setX(2.4f);
        p1.setY(5.6f);
        System.out.println("Updated default point: " + p1);

        // Get coordinates of a point
        float x = p2.getX();
        float y = p2.getY();
        System.out.println("Coordinates of p2: x = " + x + ", y = " + y);

        // Set coordinates using setXY method
        p2.setXY(9.1f, 1.3f);
        System.out.println("Updated coordinates of p2 using setXY: " + p2);

        // Get coordinates using getXY method
        float[] coordinates = p2.getXY();
        System.out.println("Coordinates of p2 using getXY: x = " + coordinates[0] + ", y = " + coordinates[1]);

        MovablePoint mp1 = new MovablePoint(4.5f, 6.7f);
        System.out.println("Movable point " + mp1);
        MovablePoint mp2 = new MovablePoint(1.2f, 3.4f, 5.6f, 7.8f);
        System.out.println("Movable point " + mp2);
        mp2.move();
        System.out.println("Moved " + mp2);

    }
}
