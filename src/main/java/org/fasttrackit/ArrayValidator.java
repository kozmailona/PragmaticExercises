package org.fasttrackit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ArrayValidator {

    public static String validateArray(int[] numbers) {
        return "VALID";
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("C:\\FASTTRACKIT\\PragmaticExercises\\src\\main\\java\\org" +
                "\\fasttrackit\\exercise 6 - input.txt"));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\FASTTRACKIT\\PragmaticExercises" +
                "\\src\\main\\java\\org\" +\n" +
                "                \"\\fasttrackit\\exercise 6 - input.txt", true));

        int testCasesCount = scanner.nextInt();

        for (int i = 1; i <= testCasesCount; i++) {
            int arrayLength = scanner.nextInt();

            int[] numbers = new int[arrayLength];

            for (int j = 0; 0 < arrayLength; j++) {
                numbers[j] = scanner.nextInt();
            }

            String result = validateArray(numbers);

            String resultLine = "CASE #" + i + ": " + result;

            bufferedWriter.write(resultLine);
        }
        bufferedWriter.close();
    }
}
