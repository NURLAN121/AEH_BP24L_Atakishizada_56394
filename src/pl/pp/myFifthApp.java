package pl.pp;

import java.util.Scanner;

public class myFifthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        System.out.print("Enter the number of times to print the character in a row: ");
        int timesInRow = scanner.nextInt();

        System.out.print("Enter the number of lines: ");
        int numberOfLines = scanner.nextInt();

        printCharacterGrid(character, timesInRow, numberOfLines);

        scanner.close();
    }

    public static void printCharacterGrid(char character, int timesInRow, int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < timesInRow; j++) {
                System.out.print(character);
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
