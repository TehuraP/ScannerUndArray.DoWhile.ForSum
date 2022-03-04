package com.company;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        //normal array
        int[] arrayexample = new int[3];
        //fill array
        arrayexample[0] = 12;
        arrayexample[1] = 56;
        arrayexample[2] = 91;
        System.out.println(Arrays.toString(arrayexample));

        // array in just one line
        int[] arrayexample2 = new int[]{12, 13, 78};
        System.out.println(Arrays.toString(arrayexample2));

        //change value of position2
        arrayexample[2] = 15;
        System.out.println(Arrays.toString(arrayexample));
    }
}
