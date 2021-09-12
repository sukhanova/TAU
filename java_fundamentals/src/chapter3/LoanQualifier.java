package chapter3;

import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {
    public static void main(String args[]){
        //Initialize what we know
        int minSalary = 30000;
        int minYearsEmployed = 2;

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
        if(salary >= minSalary){
            if(years >= minYearsEmployed){
                System.out.println("You meet requirements and qualified for loan");
            }
            else{
                System.out.println("You must have worked at current job minimum "
                        + minYearsEmployed + " years.");
            }
        }
        else{
            System.out.println("To qualify for loan you must earn at least $"
                    + minSalary);
        }
    }
}
