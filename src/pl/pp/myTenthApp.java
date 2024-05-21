package pl.pp;

public class myTenthApp {

    public static void main(String[] ignoredArgs) {
        // Example usage of countAndSumElements function
        int[] input = {1, 2, 3, 4, 5, -3, -2, -1};
        int[] result = countAndSumElements(input);
        if (result.length > 0) {
            System.out.println(STR."Number of negative elements: \{result[0]}");
            System.out.println(STR."Sum of positive elements: \{result[1]}");
        } else {
            System.out.println("The input array is empty or null.");
        }
    }

    public static int[] countAndSumElements(int[] input) {
        // Check if the input array is null or empty
        if (input == null || input.length == 0) {
            return new int[0]; // Return an empty array
        }

        int negativeCount = 0;
        int positiveSum = 0;

        // Iterate through the array
        for (int num : input) {
            if (num < 0) {
                negativeCount++; // Count negative numbers
            } else if (num > 0) {
                positiveSum += num; // Sum positive numbers
            }
        }

        // Return the result as an array
        return new int[]{negativeCount, positiveSum};
    }
}
