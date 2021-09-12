package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args){
        // Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        //to receive input in Java from console use Scanner built-in class:
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // Get the hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble();
        // Multiply hours and pay rate
        double grossPay = Math.round((hours * rate)*100)/100.0;
        double roundOffResult = Math.round(grossPay * 100)/100.0;
        // Display result
//        System.out.println(roundOffResult);
        System.out.println("The employee's gross pay is $" + grossPay);
        /* after we read in the input close scanner to let Java know
        we’re done with it and that they can free up that memory space.*/
        scanner.close();
    }
}
