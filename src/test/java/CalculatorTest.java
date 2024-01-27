import org.junit.Test;
import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(8, Calculator.add(5, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(6, Calculator.subtract(10, 4));
    }

    @Test
    public void testMultiplication() {
        assertEquals(42, Calculator.multiply(6, 7));
    }

    @Test
    public void testDivision() {
        assertEquals(4.0, Calculator.divide(8, 2), 0.0001); // Added a delta for double comparison

//        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
//            Calculator.divide(5, 0);
//        });
//        assertEquals("/ by zero", exception.getMessage());
    }
}
