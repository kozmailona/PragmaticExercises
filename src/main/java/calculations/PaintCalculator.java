package calculations;

import java.util.Scanner;

import static java.lang.StrictMath.ceil;

public class PaintCalculator {
    public static void main(String[] args) {

        final double standardSquareFeet = 350;
        final double standardGallon = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the length of the room: ");
        double length = scanner.nextDouble();
        System.out.println("Now we need the width of the room! Please, enter it: ");
        double width = scanner.nextDouble();
        double squareFeet = calculateSquareFeet(length, width);
        System.out.println(squareFeet);

        double newCalculatedValue = calculateSquareFeet(20, 40);
        System.out.println(newCalculatedValue);

        double gallonNeeded = getAnInt(standardGallon, squareFeet);
        double gallonActualNumber = gallonNeeded / standardSquareFeet;

        double gallonRoundedUp = Math.ceil(gallonActualNumber);

        int finalNumber = (int) gallonRoundedUp;
        System.out.println("You will need to purchase " + finalNumber + " gallons of paint\nto cover " + squareFeet +
                " " +
                "square feet" +
                ".");

    }

    private static double calculateSquareFeet(double length, double width) {
        return length * width;
    }

    private static double getAnInt(double standardGallon, double squareFeet) {
        return squareFeet * standardGallon;
    }

    // 350 m2 ...... 1g
    // 400 m2 ...... x g
    // x - 400 * 1 / 350 -
}
