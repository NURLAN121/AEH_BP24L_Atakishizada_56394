package pl.pp;

public class mySixthApp {

    // Iterative factorial calculation method
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive factorial calculation method
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        int N = 10;  // Change N to the desired number for factorial calculation

        // Measure execution time for iterative factorial calculation
        long startTimeIterative = System.currentTimeMillis();
        long resultIterative = factorialIterative(N);
        long endTimeIterative = System.currentTimeMillis();
        double iterativeTime = (endTimeIterative - startTimeIterative) / 1000.0; // converting to seconds

        // Measure execution time for recursive factorial calculation
        long startTimeRecursive = System.currentTimeMillis();
        long resultRecursive = factorialRecursive(N);
        long endTimeRecursive = System.currentTimeMillis();
        double recursiveTime = (endTimeRecursive - startTimeRecursive) / 1000.0; // converting to seconds

        System.out.println("Iterative factorial of " + N + ": " + resultIterative);
        System.out.println("Recursive factorial of " + N + ": " + resultRecursive);
        System.out.println("Execution time for iterative method: " + iterativeTime + " seconds");
        System.out.println("Execution time for recursive method: " + recursiveTime + " seconds");
    }
}
