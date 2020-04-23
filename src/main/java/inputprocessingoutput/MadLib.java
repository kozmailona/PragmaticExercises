package inputprocessingoutput;

import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter a verb: ");
        String input2 = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        String input3 = scanner.nextLine();
        System.out.println("Enter an adverb: ");
        String input4 = scanner.nextLine();

        System.out.println("Do you " + input2 + " your " + input3 + " " + input1 + " "+ input4 + "? That's hilarious!");

    }
}
