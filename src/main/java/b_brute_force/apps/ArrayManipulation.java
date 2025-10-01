package b_brute_force.apps;

import b_brute_force.utils.ArrayUtils;

import java.util.Random;

import static b_brute_force.utils.ArrayUtils.deduplicate;

public class ArrayManipulation {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int [] grades = new int[10];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = randomGenerator.nextInt(10);
        }

        ArrayUtils.displayArray(grades);

        int [] deduplicated = ArrayUtils.deduplicate(grades);
        System.out.println("Deduplicated");
        ArrayUtils.displayArray(deduplicated);
    }
}
