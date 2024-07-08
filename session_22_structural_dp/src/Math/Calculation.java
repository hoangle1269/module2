package Math;

public class Calculation {
    public static void main(String[] args) {
        MathCalculatorProxy proxy = new MathCalculatorProxy();
        double result = proxy.add(1, 2);
        System.out.println("1 + 2 = " + result);
        double result2 = proxy.add(1, Double.MAX_VALUE);
        System.out.println("1 + Double.MAX_VALUE = " + result2);

    }
}
