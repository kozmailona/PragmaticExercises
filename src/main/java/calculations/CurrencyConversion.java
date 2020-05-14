package calculations;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        int euro = scanner.nextInt();
        System.out.print("What is the exchange rate? ");
        double exchangeRate = scanner.nextDouble();

        double amountInUsDollar = euro * exchangeRate / 100;
        double roundOff = Math.round(amountInUsDollar*100)/100.0;

        System.out.println(euro + " euros at an exchange rate of " + exchangeRate + " is " + roundOff + " U.S" +
                ". dollars.");
    }
}
