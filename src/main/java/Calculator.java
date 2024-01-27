public class Calculator {
    // Addition method
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtraction method
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication method
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Division method
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Addition: " + add(5, 3));        // Expected: 8
        System.out.println("Subtraction: " + subtract(10, 4)); // Expected: 6
        System.out.println("Multiplication: " + multiply(6, 7)); // Expected: 42

        try {
            System.out.println("Division: " + divide(8, 2));   // Expected: 4.0
            System.out.println("Division: " + divide(5, 0));   // This should throw an exception
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
