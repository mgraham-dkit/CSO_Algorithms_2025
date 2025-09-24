package b_brute_force.utils;

public class ArrayUtils {
    public static void displayArray(int [] nums){
        int count = 0;
        for(int num: nums){
            System.out.println(count + ") " + num);
            count++;
        }
    }

    public static void displayArray(String [] text){
        if(text == null){
            throw new IllegalArgumentException("Cannot display a null array");
        }

        for (int i = 0; i < text.length; i++) {
            System.out.println(i + ") " + text[i]);
        }
    }

    public static double calcAverage(int [] nums){
        double total = 0;
        for (int num: nums) {
            total += num;
        }
        return total/nums.length;
    }

    public static int getMax(int [] nums){
        if(nums == null){
            throw new IllegalArgumentException("Cannot find maximum of null array");
        }
        if(nums.length == 0){
            throw new IllegalArgumentException("Cannot find maximum of empty array");
        }

        int currentMax = nums[0];

        for(int current: nums){
            if(current > currentMax){
                currentMax = current;
            }
        }

        return currentMax;
    }
}
