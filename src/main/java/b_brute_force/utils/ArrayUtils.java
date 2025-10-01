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
        nullValidateArray(nums);
        lengthValidateArray(nums);

        int currentMax = nums[0];

        for(int current: nums){
            if(current > currentMax){
                currentMax = current;
            }
        }

        return currentMax;
    }

    private static void lengthValidateArray(int[] nums) {
        if(nums.length == 0){
            throw new IllegalArgumentException("Cannot find maximum of empty array");
        }
    }

    private static void nullValidateArray(int[] nums) {
        if(nums == null){
            throw new IllegalArgumentException("Cannot find maximum of null array");
        }
    }

    public static int deleteAtPos(int [] nums, int pos){
        if(pos < 0 || pos >= nums.length){
            throw new IndexOutOfBoundsException("Position supplied is outside boundary of array");
        }

        int deleted = nums[pos];

        for(int i = pos; i < nums.length-1; i++){
            nums[i] = nums[i+1];
        }

        nums[nums.length-1] = 0;

        return deleted;
    }
}
