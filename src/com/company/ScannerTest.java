package com.company;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        java.util.Scanner test = new Scanner(System.in);
        System.out.println("Say something nice");
        String something = test.next();

        while (!something.equals("bad bot")) {
            System.out.println("Good boy");
            something = test.next();

        }
    }
}

