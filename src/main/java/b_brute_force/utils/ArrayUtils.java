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

    private static void validatePosition(int [] nums, int pos){
        if(pos < 0 || pos >= nums.length){
            throw new IndexOutOfBoundsException("Position supplied is outside boundary of array");
        }
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
        validatePosition(nums, pos);

        int deleted = nums[pos];

        for(int i = pos; i < nums.length-1; i++){
            nums[i] = nums[i+1];
        }

        nums[nums.length-1] = 0;

        return deleted;
    }

    public static int [] resize(int [] data, int numSlots){
        int [] resized = new int[numSlots];

        int numElements = data.length;
        if(data.length > numSlots){
            numElements = numSlots;
        }

        for (int i = 0; i < numElements; i++) {
            resized[i] = data[i];
        }

        return resized;
    }

    public static int [] deduplicate(int [] data){
        // VALIDATION
        nullValidateArray(data);

        // SETUP
        int [] deduplicated = new int[0];

        // LOGIC
        for(int num: data){
            boolean found = contains(deduplicated, num);
            if(!found){
                deduplicated = resize(deduplicated, deduplicated.length + 1);
                deduplicated[deduplicated.length-1] = num;
            }
        }
        return deduplicated;
    }

    public static boolean contains(int[] deduplicated, int num) {
        boolean contains = false;
        for (int i = 0; i < deduplicated.length; i++) {
            if (num == deduplicated[i]) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public int [] merge(int [] data1, int [] data2){
        nullValidateArray(data1);
        nullValidateArray(data2);
        // Create a new array to hold combined information
        int [] merged = new int[data1.length + data2.length];
        // Track how many elements have been added to merged data
        int count = 0;

        // Copy each element from first array into merged array
        for (int i = 0; i < data1.length; i++) {
            merged[i] = data1[i];
            count++;
        }

        // Copy each element from second array into merged array
        // starting at count index to offset elements we already added
        for (int i = 0; i < data2.length; i++) {
            merged[count] = data2[i];
            count++;
        }

        return merged;
    }

    public int[] orderedMerge(int [] data1, int [] data2){
        nullValidateArray(data1);
        nullValidateArray(data2);

        int [] merged = new int[data1.length + data2.length];

        int tracker1 = 0;
        int tracker2 = 0;

        for (int i = 0; i < merged.length; i++) {
            // If tracker 1 is outside the data1 array
            //      Read from data2
            //      Increase tracker 2
            // else if tracker 2 is outside the data2 array
            //      Read from data1
            //      Increase tracker 1
            // else if data2[tracker2] is less than data1[tracker]
            //      Read from data2
            //      Increase tracker 2
            // else
            //      Read from data1
            //      Increase tracker 1
        }

        return merged;
    }
}
