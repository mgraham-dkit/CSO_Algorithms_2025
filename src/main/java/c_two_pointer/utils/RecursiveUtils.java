package c_two_pointer.utils;

public class RecursiveUtils {
    public static void main(String[] args) {
        System.out.println("100 = " + fibonacci(100));
    }
    public static int fibonacci(int n){
        if(n < 0){
            throw new IllegalArgumentException("Fibonacci numbers must be >= 0");
        }
        System.out.println("Currently calculating " + n);
        if(n <= 1){
            return n;
        }

        return fibonacci(n-2) + fibonacci(n-1);
    }

    public static int factorial(int num){
        System.out.println("num: " + num);
        if(num <= 1){
            return 1;
        }
        int factorial =  factorial(num-1);
        System.out.println("Current factorial: " + factorial);
        return num * factorial;
    }

    public static int sum(int [] data){
        return sum(data, 0);
    }

    public static int sum(int [] data, int startPos){
        if(startPos == data.length-1){
            return data[startPos-1];
        }

        return data[startPos] + sum(data, startPos+1);
    }

    public static int binarySearch(int [] data, int target){
        if(data == null){
            throw new IllegalArgumentException("Cannot search a null array");
        }

        int start = 0;
        int end = data.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(data[mid] == target){
                return mid;
            }else if(data[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
