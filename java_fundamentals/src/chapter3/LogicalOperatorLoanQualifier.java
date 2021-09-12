package chapter3;

/*
 * LOGICAL OPERATORS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {
    public static void main(String args[]){
        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get information from user
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        // double data type holds numbers with decimal as well as integers
        double salary = scanner.nextDouble();

        System.out.println("Enter number of years with current employer:");
        // double data type holds numbers with decimal as well as integers
        double years = scanner.nextDouble();
        scanner.close();

        //Make decision
        if(salary >= requiredSalary && years >= requiredYearsEmployed){
                System.out.println("You meet requirements and qualified for loan");
            }
        else{
            System.out.println("To qualify for loan you must earn at least $"
                    + requiredSalary + " and have minimum " + requiredYearsEmployed
                    + " years working at your current company.");
        }
    }
}
