package d_sorting.utils;

public class ArrayUtils {
    public static void mergeSort(int [] data){
        mergeSort(data, 0, data.length-1);
    }

    private static void mergeSort(int [] data, int left, int right){
        if(left < right){
            int midPosition = (int) Math.floor((left + right)/2);
            mergeSort(data, left, midPosition);
            mergeSort(data, midPosition+1, right);

            merge(data, left, midPosition, right);
        }
    }

    private static void merge(int [] data, int left, int middle, int right){
        // Calculate size of two subarrays to combine
        int leftArrayLength = (middle - left) + 1;
        int rightArrayLength = (right - middle);

        // Create temp arrays
        int [] leftArray = new int[leftArrayLength];
        int [] rightArray = new int[rightArrayLength];

        // Copy over data
        for(int i = 0; i < leftArray.length; i++){
            leftArray[i] = data[(left+i)];
        }
        for(int j = 0; j < rightArray.length; j++){
            // Don't want to include the middle element here
            // as it's handled in the left array
            // So add an extra 1 to position
            rightArray[j] = data[(middle+j)+1];
        }

        // Merge the temp arrays in order
        // Track where we are in temp data
        int leftArrayPos = 0;
        int rightArrayPos = 0;

        // Track where we are inserting into in main array
        int mergedArrayPos = left;

        // While still within BOTH temp arrays
        while(leftArrayPos < leftArray.length && rightArrayPos < rightArray.length){
            // If value in left array is smaller or same as value in right array
            if(leftArray[leftArrayPos] <= rightArray[rightArrayPos]){
                // Add it to sorted array
                // Move to next slot in left array
                data[mergedArrayPos] = leftArray[leftArrayPos];
                leftArrayPos++;
            }
            else{
                // Otherwise add value from right array to sorted array
                // and move to next slot in right array
                data[mergedArrayPos] = rightArray[rightArrayPos];
                rightArrayPos++;
            }
            // Move to next slot in sorted array (this one has been filled)
            mergedArrayPos++;
        }
        // If any elements are left in left array, add them to sorted array
        while(leftArrayPos < leftArray.length){
            data[mergedArrayPos] = leftArray[leftArrayPos];
            leftArrayPos++;
            mergedArrayPos++;
        }

        // If any elements are left in right array, add them to sorted array
        while(rightArrayPos < rightArray.length){
            data[mergedArrayPos] = rightArray[rightArrayPos];
            rightArrayPos++;
            mergedArrayPos++;
        }
    }

    public static void quicksort(int [] data){
        if(data == null){
            throw new IllegalArgumentException("Array to be sorted cannot be null");
        }
        lomutoQuicksort(data, 0, data.length-1);
    }

    private static void lomutoQuicksort(int [] data, int low, int high) {
        if (low < high) {
            int partitionPoint = lomutoPartition(data, low, high);

            lomutoQuicksort(data, low, partitionPoint - 1);
            lomutoQuicksort(data, partitionPoint + 1, high);
        }
    }

    private static int lomutoPartition(int [] data, int low, int high){
        int pivot = data[high];
        int unpartitionedIndex = low;
        for(int i = low; i < high; i++){
            if(data[i] < pivot){
                swap(data, i, unpartitionedIndex);
                unpartitionedIndex++;
            }
        }
        swap(data, unpartitionedIndex, high);
        return unpartitionedIndex;
    }

    private static void swap(int[] nums, int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}