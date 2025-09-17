package conversion.conversion_exercises;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        int count = 0;

        while(num != -1) {
            System.out.println("Please enter the next number (-1 to end):");
            num = input.nextInt();
            if(num != -1) {
                sum += num;
                count++;
            }
        }

        System.out.println("The total number entered was: " + sum);
        System.out.println("The average was: " + sum/count);
    }
}
