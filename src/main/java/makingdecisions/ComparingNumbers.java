package makingdecisions;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
            if (firstNumber < secondNumber && secondNumber < thirdNumber) {
                System.out.println("The largest number is " + thirdNumber);
            }
        } else {
        System.out.println("These numbers are not different at all. Sorry, in this case we have to quit.");
    }

    }
}
