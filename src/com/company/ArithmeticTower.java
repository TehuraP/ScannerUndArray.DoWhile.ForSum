package com.company;

public class ArithmeticTower {
    public static void main(String[] args) {
        int number = 200;
        System.out.println(number);
        for (int i = 2; i < 10; i++) {
            System.out.println(number + " * " + i);
            number = number * i;
        }
        for (int j = 2; j < 10; j++) {
            System.out.println(number + "/" + j);
            number = number / j;
        }
        System.out.println(number);
    }
}
