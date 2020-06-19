package calculations;

import java.util.Scanner;

public class ComputingSimpleInterest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rateOfInterest = scanner.nextDouble() / 100;
        System.out.print("Enter the number of years: ");
        int numberOfYears = scanner.nextInt();

        double amountOfTheFinalInvestment = (principal * (1 + rateOfInterest * numberOfYears));

        System.out.println("After " + numberOfYears + " years at " + rateOfInterest + " %, the investment will be " +
                "worth $" + amountOfTheFinalInvestment);

        /*The formula for simple interest is

A = P(1 + rt), where P is
the principal amount, r is the annual rate of interest, t is the
number of years the amount is invested, and A is the amount
at the end of the investment.
Enter the principal: 1500
Enter the rate of interest: 4.3
Enter the number of years: 4
After 4 years at 4.3%, the investment will
be worth $1758.*/
    }
}
