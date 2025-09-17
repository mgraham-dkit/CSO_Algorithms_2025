package conversion.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int [] nums = new int[5];
        display(nums);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Please enter a number: ");
            int value = input.nextInt();
            nums[i] = value;
        }
        display(nums);

        int [] nums2 = {10, 20, 30, 40, 50};
        display(nums2);

        System.out.println(Arrays.toString(nums));
    }

    private static void display(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            System.out.println("Slot " + i + ") " + nums[i]);
        }
    }
}
