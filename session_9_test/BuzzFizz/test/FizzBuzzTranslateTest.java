import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    public void fizzBuzzTranslatorTest0() {
        int x = 10;
        String expected = "Buzz";
        String actual = FizzBuzzTranslate.fizzBuzzTranslator(x);
        assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzzTranslatorTest1() {
        int x = 9;
        String expected = "Fizz";
        String actual = FizzBuzzTranslate.fizzBuzzTranslator(x);
        assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzzTranslatorTest2() {
        int x = 15;
        String expected = "FizzBuzz";
        String actual = FizzBuzzTranslate.fizzBuzzTranslator(x);
        assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzzTranslatorTest3() {
        int x = 71;
        String expected = "71";
        String actual = FizzBuzzTranslate.fizzBuzzTranslator(x);
        assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzzTranslatorTest4() {
        int x = 1;
        String expected = "1";
        String actual = FizzBuzzTranslate.fizzBuzzTranslator(x);
        assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzzTranslatorTest5() {
        int x = 0;
        String expected = "0";
        String actual = FizzBuzzTranslate.fizzBuzzTranslator(x);
        assertEquals(expected, actual);
    }
}
