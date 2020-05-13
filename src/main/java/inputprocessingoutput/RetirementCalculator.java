package inputprocessingoutput;

import java.util.Scanner;

import static java.util.Calendar.YEAR;
import static java.util.Calendar.getInstance;

public class RetirementCalculator {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your current age? ");
        String age = scanner.nextLine();
        System.out.print("At what age would you like to retire? ");
        String retireAge = scanner.nextLine();
        int currentYear = getInstance().get(YEAR);
        int userCurrentAge = Integer.parseInt(age);
        int wantedRetireAgeInt = Integer.parseInt(retireAge);
        int yearsLeft = wantedRetireAgeInt - userCurrentAge;
        System.out.println("You have " + yearsLeft + " years left until you can retire.");
        int retireAgeInt = currentYear + yearsLeft;
        System.out.println("It's " + currentYear + ", so you can retire in " + retireAgeInt + ".");

    }
}
