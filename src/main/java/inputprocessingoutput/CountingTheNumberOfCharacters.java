package inputprocessingoutput;

import java.util.Scanner;

public class CountingTheNumberOfCharacters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String userInput = scanner.nextLine();
        int length = userInput.length();
        System.out.println("Homer has " + length + " characters.");
    }
}
