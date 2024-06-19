import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NextDayCalculatorTest {

    @Test
    public void testGetNextDay_01012018() {
        assertEquals("2/1/2018", NextDayCalculator.getNextDay(1, 1, 2018));
    }

    @Test
    public void testGetNextDay_31012018() {
        assertEquals("1/2/2018", NextDayCalculator.getNextDay(31, 1, 2018));
    }

    @Test
    public void testGetNextDay_30042018() {
        assertEquals("1/5/2018", NextDayCalculator.getNextDay(30, 4, 2018));
    }

    @Test
    public void testGetNextDay_28022018() {
        assertEquals("1/3/2018", NextDayCalculator.getNextDay(28, 2, 2018));
    }

    @Test
    public void testGetNextDay_29022020() {
        assertEquals("1/3/2020", NextDayCalculator.getNextDay(29, 2, 2020));
    }

    @Test
    public void testGetNextDay_31122018() {
        assertEquals("1/1/2019", NextDayCalculator.getNextDay(31, 12, 2018));
    }

    @Test
    public void testGetNextDay_15122018() {
        assertEquals("16/12/2018", NextDayCalculator.getNextDay(15, 12, 2018));
    }


}
