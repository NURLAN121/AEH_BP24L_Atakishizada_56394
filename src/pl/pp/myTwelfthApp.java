package pl.pp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class myTwelfthApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputFilePath;
        String outputFilePath;

        while (true) {
            System.out.print("Please enter the path to the input file: ");
            inputFilePath = scanner.nextLine();
            if (Files.exists(Paths.get(inputFilePath))) {
                break;
            } else {
                System.out.println("File not found, please try again.");
            }
        }

        System.out.print("Please enter the path to the output file: ");
        outputFilePath = scanner.nextLine();

        int lineCount = countLines(inputFilePath);
        System.out.println("Number of lines in the file: " + lineCount);
        writeOutput(outputFilePath, inputFilePath, lineCount);
    }

    private static int countLines(String filePath) {
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.readLine() != null) {
                lines++;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        return lines;
    }

    private static void writeOutput(String filePath, String inputFilePath, int lineCount) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("File Name: " + inputFilePath);
            writer.newLine();
            writer.write("Number of Lines: " + lineCount);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file: " + e.getMessage());
        }
    }
}
