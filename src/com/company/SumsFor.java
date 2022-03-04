package com.company;

public class SumsFor {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 10; i++){
            //sum = sum + 1
            sum += i;
        }
        System.out.println(sum);

        for (int index = 0; index <= 100; index++) {
            sum+= index;
        }
        System.out.println(sum);

        String sentence = "Finally weekend!";

        for (int j = 0; j < 10; j++) {

            System.out.println(j+ " " + sentence);
        }

    }
}
