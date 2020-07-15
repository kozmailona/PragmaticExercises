package calculations;

import java.util.Scanner;

public class DeterminingCompoundInterest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        double principalAmount = scanner.nextDouble();
        System.out.print("What is the rate? ");
        double rate = scanner.nextDouble() / 100;
        System.out.print("What is the number of years? ");
        int numberOfYears = scanner.nextInt();
        System.out.print("What is the number of times the interest\n" + "is compounded per year? ");
        int numberOfTimes = scanner.nextInt();

        double amountAtTheEndOfInvestment =principalAmount * Math.pow(1 + (rate / numberOfTimes), numberOfTimes * numberOfYears);
        System.out.print(principalAmount + " invested at " + rate * 100 + "% for " + numberOfYears + " years\n" +
                "compounded " + numberOfTimes + " times per year is $" + amountAtTheEndOfInvestment +
                ".");
    }
}

//The pow() function computes the power of a number
