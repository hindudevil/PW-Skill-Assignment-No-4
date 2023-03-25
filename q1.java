//Q1 - Write a program which takes the values of length and breadth from user and check if it is a square or not.

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        if (length == breadth) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is not a square.");
        }
    }
}
