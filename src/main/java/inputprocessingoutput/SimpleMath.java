package inputprocessingoutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String firstNumber = scanner.nextLine();
        System.out.print("What is the second number? ");
        String secondNumber = scanner.nextLine();

        int secondEnteredNumber = Integer.parseInt(secondNumber);
        int firstEnteredNumber = Integer.parseInt(firstNumber);

        int sum = firstEnteredNumber + secondEnteredNumber;
        int difference = firstEnteredNumber - secondEnteredNumber;
        int product = firstEnteredNumber * secondEnteredNumber;
        int quotient = firstEnteredNumber / secondEnteredNumber;


        System.out.println(firstEnteredNumber + " + " + secondEnteredNumber + " = " + sum + "\n"
                + firstEnteredNumber + " - " + secondEnteredNumber + " = " + difference + "\n"
                + firstEnteredNumber + " * " + secondEnteredNumber + " = " + product + "\n"
                + firstEnteredNumber + " / " + secondEnteredNumber + " = " + quotient);



    }
}
