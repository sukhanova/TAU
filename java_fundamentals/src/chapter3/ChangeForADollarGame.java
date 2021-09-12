package chapter3;

import java.util.Scanner;
//The objective of the game is to enter enough change to equal exactly one dollar.

public class ChangeForADollarGame {
    public static void main (String args[]){
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        int dollar = 1;

        System.out.println("Welcome to the game. " +
                "Your goal to enter change to make exactly $1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pennies would you like?");
        int numOfPennies = scanner.nextInt();
        System.out.println("How many nickels would you like?");
        int numOfNickels = scanner.nextInt();
        System.out.println("How many dimes would you like?");
        int numOfDimes = scanner.nextInt();
        System.out.println("How many quarters would you like?");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        double total = numOfPennies * penny + numOfNickels * nickel + numOfDimes * dime + numOfQuarters * quarter;

        if(total < dollar){
            double amountShort = dollar - total;
            System.out.println("You lost. You are $" + String.format("%.2f", amountShort) + " short");
        }
        else if(total > dollar){
            double amountOver = total - dollar;
            System.out.println("You lost. You are $" + String.format("%.2f", amountOver) + " over");
        }
        else{
            System.out.println("You win! That is exactly $1.");
        }
    }
}
