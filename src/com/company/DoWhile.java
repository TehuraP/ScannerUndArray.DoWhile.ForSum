package com.company;

public class DoWhile {
    public static void main(String[] args) {
        countToHundred(1);
        counttoHundredInclusive(1);
        countToHundredThree(1);
    }

    public static void countToHundred(int from) {
        do {
            from++;
            System.out.println(from);
        }
        while (from < 100);

    }

    public static void counttoHundredInclusive(int from) {
        do {
            System.out.println(from);
            from++;
        }
        while (from < 100);

    }

    public static void countToHundredThree (int from) {
        do {
            from ++;
        }
        while (from<100);
        System.out.println(from);
    }
}
