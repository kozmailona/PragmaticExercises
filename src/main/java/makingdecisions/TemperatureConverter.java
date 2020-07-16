package makingdecisions;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Press C to convert from Farenheit to Celsius.\n" + "Press F to convert from Celsius to " +
                "Farenheit. ");
        String userInput = scanner.nextLine();
        System.out.println("Your choice: " + userInput);
        System.out.println();

        if (userInput.equals("C")) {

            System.out.print("Please enter the temperature in Farenheit: ");
            int enteredTempereature = scanner.nextInt();
            int convertedFarenheitToCelsius = (enteredTempereature - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + convertedFarenheitToCelsius + ".");
        }

        if (userInput.equals("F")) {
            System.out.println("Please enter the temperature in Celsius: ");
            double enteredTemperature = scanner.nextDouble();
            double convertedCelsiusToFarenheit = (enteredTemperature * 9 / 5) + 32;
            System.out.println("The temperature in Farenheit is " + convertedCelsiusToFarenheit);
        }
    }
}
