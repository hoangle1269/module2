import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    @DisplayName("Testing addition")
    void TestCalculateAddition() {
        int firstOperand = 1;
        int secondOperand = 1;
        char operator = '+';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing subtraction")
    void TestCalculateSubtraction() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = '-';
        int expected = 1;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void TestCalculateMultiplication() {
        int firstOperand = 2;
        int secondOperand = 2;
        char operator = '*';
        int expected = 4;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void TestCalculateDivision() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = '/';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void TestCalculateDivisionByZero() {
        int firstOperand = 2;
        int secondOperand = 0;
        char operator = '/';

        assertThrows(RuntimeException.class,
                () -> Calculator.calculate(firstOperand, secondOperand, operator));
    }

    @Test
    @DisplayName("Testing wrong operator")
    void TestCalculateWrongOperator() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = '=';

        assertThrows(RuntimeException.class,
                () -> Calculator.calculate(firstOperand, secondOperand, operator));
    }

}
