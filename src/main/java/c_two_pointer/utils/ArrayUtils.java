package c_two_pointer.utils;

public class ArrayUtils {
    // Algorithm: Binary search
    // Divide and conquer approach to searching
    // Only works correctly if input is in sorted order (ascending)
    public static int search(int [] nums, int value){
        if(nums == null){
            throw new IllegalArgumentException("Array to be searched cannot be null");
        }

        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == value){
                return mid;
            }else if(value > nums[mid]){
                start = mid + 1;
            }else{
                end = mid -1;
            }

        }
        return -1;
    }

    public static void displayArray(int [] nums){
        if(nums == null){
            throw new IllegalArgumentException("Cannot display a null array");
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + ") " + nums[i]);
        }
    }

    public static String toString(int [] nums){
        if(nums == null){
            throw new IllegalArgumentException("Cannot display a null array");
        }
        if(nums.length == 0){
            return "Array contains no elements";
        }
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < nums.length-1; i++){
            sb.append(nums[i]);
            sb.append(",");
        }

        sb.append(nums[nums.length-1]);
        sb.append("]");

        return sb.toString();
    }
}
