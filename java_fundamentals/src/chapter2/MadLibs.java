package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String arg[]){
        /*Create a program that asks a user for a season of the year,
        then a whole number, then an adjective.
        And use the input to complete the sentence below.
        Output the result.*/

        // ask user for a season of the year
        System.out.println("Please type a season of the year");
        Scanner scanner = new Scanner(System.in);
        String seasonOfYear = scanner.next();

        // ask user for a whole number
        System.out.println("Please type whole number");
        int wholeNumber = scanner.nextInt();

        // ask user for an adjective
        System.out.println("Please type an adjective");
        String adjective = scanner.next();
        scanner.close();
        // output result
        System.out.println("On a " + adjective + " " + seasonOfYear +
                " day, I drink a minimum of "+ wholeNumber+" cups of coffee.");


    }
}
