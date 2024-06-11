package pl.pp;

import java.io.*;
import java.util.*;

public class myThirteenthApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFilePath;
        String outputFilePath;

        while (true) {
            System.out.print("Please enter the path for the input text file: ");
            inputFilePath = scanner.nextLine();

            File inputFile = new File(inputFilePath);
            if (inputFile.exists() && !inputFile.isDirectory()) {
                break;
            } else {
                System.out.println("The input file does not exist. Please provide another file.");
            }
        }

        System.out.print("Please enter the path for the output file: ");
        outputFilePath = scanner.nextLine();

        try {
            File inputFile = new File(inputFilePath);
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            Map<String, Integer> wordCountMap = new HashMap<>();
            String line;
            int totalWords = 0;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                totalWords += words.length;

                for (String word : words) {
                    word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
                    if (word.isEmpty()) {
                        continue;
                    }
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
            reader.close();

            // Display the total number of words in the console
            System.out.println("Total number of words: " + totalWords);

            // Write the results to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            writer.write("Filename: " + inputFilePath + "\n");
            writer.write("Total number of words: " + totalWords + "\n");
            writer.write("Occurrences of each word:\n");

            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            writer.close();

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file or writing the output.");
            e.printStackTrace();
        }
    }
}
