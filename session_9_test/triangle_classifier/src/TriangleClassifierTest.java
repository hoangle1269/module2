import org.junit.jupiter.api.Test;

class TriangleClassifierTest {

    @Test
    void triangleClassifiedTestEquilateral() {
        int a = 2;
        int b = 2;
        int c = 2;

        String expected = "Equilateral Triangle";
        String actual = TriangleClassifier.checkTriangle(a, b, c);

        assert expected.equals(actual);
    }

    @Test
    void triangleClassifiedTestIsosceles() {
        int a = 2;
        int b = 2;
        int c = 3;

        String expected = "Isosceles Triangle";
        String actual = TriangleClassifier.checkTriangle(a, b, c);

        assert expected.equals(actual);
    }

    @Test
    void triangleClassifiedTestNormal() {
        int a = 3;
        int b = 4;
        int c = 5;

        String expected = "Normal Triangle";
        String actual = TriangleClassifier.checkTriangle(a, b, c);

        assert expected.equals(actual);
    }

    @Test
    void triangleClassifiedTestAbnormal0() {
        int a = 8;
        int b = 2;
        int c = 3;

        String expected = "Not A Triangle";
        String actual = TriangleClassifier.checkTriangle(a, b, c);

        assert expected.equals(actual);
    }

    @Test
    void triangleClassifiedTestAbnormal1() {
        int a = -1;
        int b = 2;
        int c = 1;

        String expected = "Not A Triangle";
        String actual = TriangleClassifier.checkTriangle(a, b, c);

        assert expected.equals(actual);
    }

    @Test
    void triangleClassifiedTestAbnormal2() {
        int a = 0;
        int b = 1;
        int c = 1;

        String expected = "Not A Triangle";
        String actual = TriangleClassifier.checkTriangle(a, b, c);

        assert expected.equals(actual);
    }




}