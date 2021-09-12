package chapter3;


import java.util.Scanner;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don’t, they are informed of how many sales they were short.
 */
public class QuotaCalculator {
    public static void main(String args[]){
       // Initializing known values
       int quota = 10;

       // Get known values
        System.out.println("Enter number of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make decision on the path to take - Output
        //if we have single if statement - we can remove {}
//        if(sales >= quota)
//            System.out.println("Great! You've met your quota!");

        if(sales >= quota){
            System.out.println("Great! You've met your quota!");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You did not make quota this week. You are "
                    + salesShort + " sales short!");
        }
    }
}
