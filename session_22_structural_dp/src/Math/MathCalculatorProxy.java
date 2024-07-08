package Math;

public class MathCalculatorProxy implements Calculator {
    private MathCalculator mathCalculator;

    protected MathCalculatorProxy() {
        this.mathCalculator = new MathCalculator();
    }

    @Override
    public double add(double firstNumber, double secondNumber) {
        if (firstNumber / 2 + secondNumber / 2 >= Double.MAX_VALUE / 2) {
            throw new RuntimeException("Out of rangeeeeeee");
        }
        if (firstNumber / 2 + secondNumber / 2 <= Double.MIN_VALUE / 2) {
            throw new RuntimeException("Out of fucking range");
        } else
            return mathCalculator.add(firstNumber, secondNumber);
    }

    @Override
    public double sub(double firstNumber, double secondNumber) {
        if (firstNumber / 2 - secondNumber / 2 >= Double.MAX_VALUE / 2) {
            throw new RuntimeException("Out of da fucking range");
        }
        if (firstNumber / 2 - secondNumber / 2 <= Double.MAX_VALUE / 2) {
            throw new RuntimeException("out of range rover");
        } else
            return mathCalculator.sub(firstNumber, secondNumber);
    }

    @Override
    public double mul(double firstNumber, double secondNumber) {
        double result = mathCalculator.mul(firstNumber, secondNumber);
        if (firstNumber != 0 && result / firstNumber != secondNumber) {
            throw new RuntimeException("out of range");
        } else
            return mathCalculator.mul(firstNumber, secondNumber);
    }

    @Override
    public double div(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new RuntimeException("can't divide by zero");
        }
        return mathCalculator.div(firstNumber, secondNumber);
    }
}
