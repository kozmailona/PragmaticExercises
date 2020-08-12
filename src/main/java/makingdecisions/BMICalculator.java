package makingdecisions;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter your height (in inch): ");
        double height = scanner.nextDouble();
        System.out.print("Next step. Enter your weight (in pounds): ");
        double weight = scanner.nextDouble();

        double bmiIndex = (weight / ( height * height)) * 703;
        System.out.println("Your BMI is " + bmiIndex + ".");

        if (bmiIndex >= 18.5 && bmiIndex <= 25) {
            System.out.println("You are within the ideal weight range.");
        }

        if (bmiIndex < 18.5) {
            System.out.println("You are underweight. You should see your doctor.");
        }

        if (bmiIndex > 25) {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}
//bmi = (weight / (height × height))*703
//height in inches and weight in pounds
//18,5 - 25 normal