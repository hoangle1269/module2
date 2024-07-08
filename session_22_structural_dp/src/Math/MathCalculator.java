package Math;

public class MathCalculator implements Calculator{
    @Override
    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public double sub(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public double mul(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public double div(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}
