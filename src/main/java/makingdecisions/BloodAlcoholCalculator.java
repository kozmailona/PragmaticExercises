package makingdecisions;

import java.util.Map;
import java.util.Scanner;

public class BloodAlcoholCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.print("Your gender (M/F): ");
        String gender = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Number of drinks: ");
        int numberOfDrinks = scanner.nextInt();
        System.out.print("Amount of alcohol by volume of the drinks consumed (oz): ");
        double amountOfAlcoholByVolume = scanner.nextDouble();
        System.out.print("Amount of time since your last drink (hrs): ");
        int amountOfTime = scanner.nextInt();
        double bacMen = (amountOfAlcoholByVolume * 5.14 / weight * 0.73) - .015 * amountOfTime;
        double bacWomen = (amountOfAlcoholByVolume * 5.14 / weight * 0.66) - .015 * amountOfTime;

        if (gender == "M") {
            System.out.println("Your bac is: " + bacMen);
        }

        if (gender == "F") {
            System.out.println("Your bac is: " + bacWomen);
        }

    }
}
//12 ounces of regular beer, which is usually about 5% alcohol
//5 ounces of wine, which is typically about 12% alcohol
//1.5 ounces of distilled spirits, which is about 40% alcohol