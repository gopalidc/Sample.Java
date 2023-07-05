package com.mycompany;

import java.util.Scanner;

public class TaxCal {
    public static void main(String[] args) {
        float tax = 0;
        float income = 0;
        System.out.println("Enter your Income:");
        Scanner sc = new Scanner(System.in);
        income = sc.nextFloat();
        System.out.println("Your Income is :" + income);

        if (income < 2.5) {
            tax = tax + 0;
            System.out.println("your tax is:" + tax);
        }
        if (income > 2.5 && income < 5) {
            tax = tax + ((income * 5) / 100);
            System.out.println("Your tax is" + tax);
        }

        if (income > 5) {
            tax = tax + ((income * 10) / 100);
            System.out.println("Your tax is" + tax);
        }

    }
}