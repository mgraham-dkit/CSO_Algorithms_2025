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

    public static void selectionSort(int [] nums){
        validateNullArray(nums);

        for(int startSlot = 0; startSlot < nums.length-1; startSlot++){
            int minIndex = startSlot;

            minIndex = getMinIndex(nums, startSlot+1, minIndex);

            swap(nums, startSlot, minIndex);
        }
    }

    public static int getMinIndex(int[] nums, int startSlot, int minIndex) {
        for (int i = startSlot; i < nums.length; i++) {
            if(nums[i] < nums[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void optimisedSort(int [] data){
        validateNullArray(data);

        if(data.length <= 1){
            return;
        }

        for (int passCount = 0; passCount < data.length; passCount++) {
            boolean swapped = false;
            for (int i = 0; i < data.length - 1 - passCount; i++) {
                if(data[i] > data[i+1]){
                    swap(data, i, i+1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public static void sort(int [] data){
        validateNullArray(data);

        if(data.length <= 1){
            return;
        }

        for (int passCount = 0; passCount < data.length; passCount++) {
            for (int i = 0; i < data.length - 1 - passCount; i++) {
                if(data[i] > data[i+1]){
                    swap(data, i, i+1);
                }
            }
        }
    }

    private static void validateNullArray(int[] data) {
        if(data == null){
            throw new IllegalArgumentException("Array to be sorted cannot be null");
        }
    }

    public static void sort(String [] data){
        if(data == null){
            throw new IllegalArgumentException("Array to be sorted cannot be null");
        }

        if(data.length <= 1){
            return;
        }

        for (int passCount = 0; passCount < data.length; passCount++) {
            for (int i = 0; i < data.length - 1 - passCount; i++) {
                if(data[i].compareToIgnoreCase(data[i+1]) > 0){
                    swap(data, i, i+1);
                }
            }
        }
    }

    private static void swap(String[] data, int posA, int posB) {
        String temp = data[posA];
        data[posA] = data[posB];
        data[posB] = temp;
    }

    private static void swap(int[] data, int posA, int posB) {
        int temp = data[posA];
        data[posA] = data[posB];
        data[posB] = temp;
    }
}
