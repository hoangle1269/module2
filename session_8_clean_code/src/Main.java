public class Main {
    public static void main(String[] args) {
        int firstOperand = 2;
        int secondOperand = 1;

        // Addition
        char operator = Calculator.ADDITION;
        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        System.out.println("Addition result: " + result);

        // Subtraction
        operator = Calculator.SUBTRACTION;
        result = Calculator.calculate(firstOperand, secondOperand, operator);
        System.out.println("Subtraction result: " + result);

        // Multiplication
        operator = Calculator.MULTIPLICATION;
        result = Calculator.calculate(firstOperand, secondOperand, operator);
        System.out.println("Multiplication result: " + result);

        // Division
        operator = Calculator.DIVISION;
        result = Calculator.calculate(firstOperand, secondOperand, operator);
        System.out.println("Division result: " + result);

        // Division by zero
        try {
            operator = Calculator.DIVISION;
            secondOperand = 0;
            result = Calculator.calculate(firstOperand, secondOperand, operator);
            System.out.println("Division by zero result: " + result);
        } catch (RuntimeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Unsupported operator
        try {
            operator = '=';
            result = Calculator.calculate(firstOperand, secondOperand, operator);
            System.out.println("Unsupported operator result: " + result);
        } catch (RuntimeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
