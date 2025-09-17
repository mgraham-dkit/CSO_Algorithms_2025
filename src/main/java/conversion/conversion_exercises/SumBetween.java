package conversion.conversion_exercises;

import java.util.Scanner;

public class SumBetween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number:");
        int num2 = input.nextInt();

        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int total = 0;
        for(int i = num1; i <= num2; i++){
            total = total + i;
        }

        System.out.println("Total = " + total);
    }
}
