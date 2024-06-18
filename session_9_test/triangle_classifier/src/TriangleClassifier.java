public class TriangleClassifier {
    public static String checkTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Not A Triangle";
        }
        if (a == b && b == c) {
            return "Equilateral Triangle";
        }
        if (a == b || b == c) {
            return "Isosceles Triangle";
        }
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            return "Normal Triangle";
        }
        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            return "Not A Triangle";
        }
        return null;
    }
}
