package calculations;

import java.util.Scanner;

public class AreaOfARectangularRoom {
    public static void main(String[] args) {

        final double conversionFactor = 0.09290304;
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        double length = scanner.nextDouble();       //maybe it is a decimal number
        System.out.print("What is the width of the room in feet? ");
        double width = scanner.nextDouble();
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");

        double area = length * width;
        double areaInMeters = area * conversionFactor;
        System.out.println("The area is\n" + area + " square feet\n" + areaInMeters + " square meters" );

    }
}