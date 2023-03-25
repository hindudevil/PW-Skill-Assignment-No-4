//Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and calculate Profit or Loss.

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost price: ");
        double costPrice = sc.nextDouble();

        System.out.print("Enter the selling price: ");
        double sellingPrice = sc.nextDouble();

        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            System.out.println("You made a profit of " + profit);
        } else if (sellingPrice < costPrice) {
            double loss = costPrice - sellingPrice;
            System.out.println("You incurred a loss of " + loss);
        } else {
            System.out.println("You neither made a profit nor a loss.");
        }
    }
}
