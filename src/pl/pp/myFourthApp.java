package pl.pp;

import java.util.Scanner;

class myFourthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            int lowerLimit = scanner.nextInt();
            int upperLimit = scanner.nextInt();

            if (upperLimit <= lowerLimit) {
                System.out.println("Upper limit must be greater than the lower limit. Exiting.");
                break;
            }

            int sumOfSquares = calculateSumOfSquares(lowerLimit, upperLimit);
            System.out.println("The sums of the squares from " + (lowerLimit * lowerLimit) + " to " + (upperLimit * upperLimit) + " is " + sumOfSquares);
        }

        System.out.println("Done");
    }

    private static int calculateSumOfSquares(int lowerLimit, int upperLimit) {
        int sum = 0;
        for (int i = lowerLimit; i <= upperLimit; i++) {
            sum += i * i;
        }
        return sum;
    }
}