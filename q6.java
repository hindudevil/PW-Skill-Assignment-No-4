//Q6 - Write a program to calculate marks to grades . Follow the conversion rule as given below :

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        String grade;

        if (marks >= 90 ) {
            grade = "A+";
        } else if (marks >= 80 ) {
            grade = "A";
        } else if (marks >= 70 ) {
            grade = "B+";
        } else if (marks >= 60 ) {
            grade = "B";
        } else if (marks >= 50 ) {
            grade = "C";
        } else if (marks >= 40 ) {
            grade = "D";
        } else if (marks >= 30 ) {
            grade = "E";
        } else if (marks <  30 ) {
            grade = "F";
        } else {
            System.out.println("Invalid marks entered. Please enter a number between 0 and 100.");
            return;
        }

        System.out.println("Your grade is: " + grade);
    }
}
