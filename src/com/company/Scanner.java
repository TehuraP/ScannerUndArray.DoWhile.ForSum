package com.company;

public class Scanner {
    public static void main(String[] args) {
    java.util.Scanner reader = new java.util.Scanner(System.in);
        System.out.println("Enter a number, then press enter :");

        int number = reader.nextInt();

        System.out.println("You entered: " + number);



    }

}
