package calculations;

import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people? ");
        int people = scanner.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizzas = scanner.nextInt();
        System.out.print("How many slices do you have per pizza? ");
        int slicePerPizza = scanner.nextInt();
        System.out.println();
        System.out.println(people + " people with " + pizzas + " pizzas");

        int division = people / pizzas;
        int slicesPerPerson = slicePerPizza / division;
        int remainder = (slicePerPizza * pizzas) % people;

        System.out.println("Each person gets " + slicesPerPerson + " of pizza.\nThere are " + remainder + " leftover " +
                "pieces.");
    }
}
