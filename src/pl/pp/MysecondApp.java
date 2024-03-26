package pl.pp;

import java.util.Scanner;

public class MysecondApp {
    public static void main(String[] args) {
        // This is a line comment
        Scanner scanner = new Scanner(System.in);
        /* This is a block comment
           It can have multiple lines
           Just like here */
        System.out.println("Please enter your name:");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your surname:");
        String lastName = scanner.nextLine();
        scanner.close();
        System.out.println("Welcome " + firstName + " " + lastName);
    }
}
class mySecondApp {
    public static void main(String[] args) {
        double x = 10; // creating a double type variable and assigning it a value of 10
        double y = 2;
        Scanner scanner = new Scanner(System.in);

        // Calculating and printing the result of addition
        var result = x + y;
        System.out.println("x + y = " + result);

        // Calculating and printing the result of subtraction
        result = x - y;
        System.out.println("x - y = " + result);

        // Calculating and printing the result of multiplication
        result = x * y;
        System.out.println("x * y = " + result);

        // Calculating and printing the result of division
        result = x / y;
        System.out.println("x / y = " + result);

        // Calculating and printing the result of modulus
        result = x % y;
        System.out.println("x % y = " + result);

        System.out.println("Enter two numbers separated by the Enter key:");
        double first = scanner.nextDouble(); // request to enter a double value
        double second = scanner.nextDouble();

        // Calculating and printing the result of addition of user-input numbers
        System.out.println("x + y = " + (first + second));
    }
}
