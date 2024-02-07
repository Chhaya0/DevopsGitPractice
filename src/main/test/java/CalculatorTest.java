import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testSubtraction() {
        assertEquals(3, 5 - 2);
    }

    @Test
    public void testMultiplication() {
        assertEquals(10, 2 * 5);
    }

    @Test
    public void testDivision() {
        assertEquals(2, 10 / 5);
    }
}
