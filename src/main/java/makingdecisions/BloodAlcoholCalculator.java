package makingdecisions;

import java.util.Map;
import java.util.Scanner;

public class BloodAlcoholCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your weight in pounds: ");
        double weight = scanner.nextDouble();
//        System.out.println("weight = " + weight);
        System.out.print("Amount of alcohol by volume of the drinks consumed (oz): ");
        double amountOfAlcoholByVolume = scanner.nextDouble();
//        System.out.println("amount of acholol = " + amountOfAlcoholByVolume);
        System.out.print("Amount of time since your last drink (hrs): ");
        int amountOfTime = scanner.nextInt();
//        System.out.println("time = " + amountOfTime);
        System.out.print("Your gender (M/F): ");
        scanner = new Scanner(System.in);
        String gender = scanner.nextLine();
//        System.out.println("gender = " + gender);

        double bacMen = ((amountOfAlcoholByVolume * 5.14 / weight * 0.73) - 0.015 * amountOfTime);
        double bacWomen = ((amountOfAlcoholByVolume * 5.14 / weight * 0.66) - 0.015 * amountOfTime);

        if (gender.equals("M")) {
            System.out.println("Your bac is: " + bacMen);
            if (bacMen >= 0.08) {
                System.out.println("It is not legal for you to drive.");
            }
        }

        if (gender.equals("F")) {
            System.out.println("Your bac is: " + bacWomen);
            if (bacWomen >= 0.08) {
                System.out.println("It is not legal for you to drive.");
            }
        }

    }
}
//12 ounces of regular beer, which is usually about 5% alcohol
//5 ounces of wine, which is typically about 12% alcohol
//1.5 ounces of distilled spirits, which is about 40% alcohol