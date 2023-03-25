//Q2 - Write a program to print absolute value of a number entered by the user.

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int absoluteValue = Math.abs(number);

        System.out.println("The absolute value of " + number + " is " + absoluteValue);
    }
}
