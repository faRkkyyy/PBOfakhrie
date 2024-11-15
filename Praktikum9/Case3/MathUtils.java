public class MathUtils {
    
    public static int factorial(int n) {
        // Throw an exception for negative numbers
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        // Throw an exception for numbers greater than 16 (overflow)
        if (n > 16) {
            throw new IllegalArgumentException("Factorial is too large for numbers greater than 16.");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
