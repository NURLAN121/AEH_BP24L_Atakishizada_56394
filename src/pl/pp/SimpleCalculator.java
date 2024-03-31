package pl.pp;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = getValidChoice(scanner);

            if (choice == 5) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            double num1 = getValidNumber("Enter the first number: ", scanner);
            double num2 = getValidNumber("Enter the second number: ", scanner);

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero. Please try again.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
            }
        }
    }

    private static int getValidChoice(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice >= 1 && choice <= 5) {
                    return choice;
                }
            }
            System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            scanner.nextLine(); // Clear the input buffer
        }
    }

    private static double getValidNumber(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.nextLine(); // Clear the input buffer
        }
    }
}