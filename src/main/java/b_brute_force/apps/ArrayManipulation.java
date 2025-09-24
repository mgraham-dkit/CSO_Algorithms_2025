package b_brute_force.apps;

import b_brute_force.utils.ArrayUtils;

import java.util.Random;

public class ArrayManipulation {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int [] grades = new int[10];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = randomGenerator.nextInt(101);
        }

        ArrayUtils.displayArray(grades);
        System.out.println(ArrayUtils.calcAverage(new int [0]));
    }
}
