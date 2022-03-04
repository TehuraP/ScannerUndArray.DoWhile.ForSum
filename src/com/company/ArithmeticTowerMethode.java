package com.company;

public class ArithmeticTowerMethode {
    public static void main(String[] args) {
        int number = 100;
        long number1 = 202103;
        System.out.println(number1);
        makeTower(number);

    }

    public static void makeTower(int number) {
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
