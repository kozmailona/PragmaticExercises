package makingdecisions;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {

        String storedPassword = "Liza123456";
        System.out.print("What is the password? ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (storedPassword.equals(password)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }
    }
}
