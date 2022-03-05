package com.company;

import java.util.Scanner;

public class ScannerVowels {
    public static void main(String[] args) {
        compareLetters();

    }

    public static void compareLetters() {
        Scanner vowelcheck = new Scanner(System.in); //
        System.out.println("Enter a letter: ");

        String letter = vowelcheck.next();

        while (!letter.equals("0")) {
            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
                System.out.println("it is a vowel");
                letter = vowelcheck.next();

            } else {
                System.out.println("it is NOT a vowel");
                letter = vowelcheck.next();
            }

        }
        vowelcheck.close();
    }
}
