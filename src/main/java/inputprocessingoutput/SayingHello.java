package inputprocessingoutput;

import java.util.Scanner;

public class SayingHello {

        public static void main(String[] args) {

            String myName = "Ilona";
            System.out.println("What is your name? " + myName + "\n" + "Hello, " + myName + ", nice to meet you!");
            System.out.println("----------");

            System.out.println("What is your name? Ilona \nHello, Ilona, nice to meet you!");



            System.out.println("----------");
            Scanner scanner = new Scanner(System.in);
            System.out.print("What is your name? ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + ", nice to meet you!");
            System.out.println("----------");



        }
    }


