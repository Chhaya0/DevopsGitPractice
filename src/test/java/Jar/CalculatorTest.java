public class CalculatorTest {

    public static void main(String[] args) {
        testAddition();
        testSubtraction();
        testMultiplication();
        testDivision();
    }

    // Test case for addition
    public static void testAddition() {
        int result = Calculator.add(5, 3);
        assertResult("Addition", result, 8);
    }

    // Test case for subtraction
    public static void testSubtraction() {
        int result = Calculator.subtract(10, 4);
        assertResult("Subtraction", result, 6);
    }

    // Test case for multiplication
    public static void testMultiplication() {
        int result = Calculator.multiply(6, 7);
        assertResult("Multiplication", result, 42);
    }

    // Test case for division
    public static void testDivision() {
        double result1 = Calculator.divide(8, 2);
        assertResult("Division (valid)", result1, 4.0);

        try {
            Calculator.divide(5, 0);
            System.out.println("Division (invalid): Test failed - Expected ArithmeticException");
        } catch (ArithmeticException e) {
            System.out.println("Division (invalid): Test passed - " + e.getMessage());
        }
    }

    // Helper method to assert and print test results
    private static void assertResult(String operation, double actual, double expected) {
        if (actual == expected) {
            System.out.println(operation + ": Test passed");
        } else {
            System.out.println(operation + ": Test failed - Expected: " + expected + ", Actual: " + actual);
        }
    }

    // Overloaded method for integer results
    private static void assertResult(String operation, int actual, int expected) {
        assertResult(operation, (double) actual, (double) expected);
    }
}
