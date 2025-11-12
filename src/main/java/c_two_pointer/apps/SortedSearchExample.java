package c_two_pointer.apps;

import c_two_pointer.utils.ArrayUtils;

import java.util.Arrays;
import java.util.Random;

public class SortedSearchExample {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int [] grades = new int[10];
        for (int i = 0; i < grades.length-1; i++) {
            grades[i] = randomGenerator.nextInt(100);
        }

        int target = 45;
        grades[grades.length-1] = target;

        System.out.println("Before sorting:");

        System.out.print("Array contents: " + ArrayUtils.toString(grades));
        System.out.println();

        int index = ArrayUtils.search(grades, target);
        if(index == -1){
            System.out.println(target + " could not be found in the array.");
        }else{
            System.out.println(target + " found at index " + index + "!");
        }

        Arrays.sort(grades);

        System.out.println("After sorting:");

        System.out.print("Array contents: " + ArrayUtils.toString(grades));
        System.out.println();

        index = ArrayUtils.search(grades, target);
        if(index == -1){
            System.out.println(target + " could not be found in the array.");
        }else{
            System.out.println(target + " found at index " + index + "!");
        }
    }
}
