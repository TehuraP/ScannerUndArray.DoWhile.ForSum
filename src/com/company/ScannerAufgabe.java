package com.company;

import java.util.Scanner;

public class ScannerAufgabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int number = scanner.nextInt();
        int sum = 5;

        while (number > 0) {
            if (number == 2) {
                sum = sum * 2;
                System.out.println("Double Bonus!");
                System.out.println("Enter another number: ");
                number = scanner.nextInt();
            } else if (number == 3) {
                sum = sum * 3;
                System.out.println("Tripple Bonus");
                System.out.println("Enter another number: ");
                number = scanner.nextInt();
            } else if (number == 22) {
                sum = sum / 2;
                System.out.println("Half a Bonus");
                System.out.println("Enter another number: ");
                number = scanner.nextInt();
            } else {
                // sum = sum + number
                sum += number;
                System.out.println("Enter another number: ");
                number = scanner.nextInt();
            }
        }
        System.out.println("Your total sum is: " + sum);
        scanner.close();
    }

}

