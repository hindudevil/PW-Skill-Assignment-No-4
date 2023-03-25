//Q4 - Write a program to print positive number entered by the user, if user enters a negative number, it is skipped.

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        while (number >= 0) {
            if(number > 0) {
                System.out.println(number);
            }
            System.out.print("Enter another number (or a negative number to quit): ");
            number = sc.nextInt();
        }
    }
}
