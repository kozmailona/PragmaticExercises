package makingdecisions;

import java.util.Scanner;

public class LegalDrivingAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are old enough to legally drive.");
        } else {
            System.out.println("You are not old enough to legally drive.");
        }
    }
}
