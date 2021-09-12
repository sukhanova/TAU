package chapter4;

import java.util.Scanner;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */
public class AverageTestScores {
    public static void main(String args[]){
        //Initialize what we know
        int numOfStudents = 24;
        int numOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //Process all students
        for(int i=0;i < numOfStudents; i++){
            double total = 0;
            for(int y=0; y < numOfTests; y++){
                System.out.println("Enter the score for Test #" + (y+1));
                double score = scanner.nextDouble();
                total += score;
            }
            double average = total / numOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + average);
            scanner.close();
        }
    }
}
