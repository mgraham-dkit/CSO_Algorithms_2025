package a_conversion;

import java.util.Scanner;

public class Branching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = 20;

        System.out.println("Welcome to the number guessing game!");

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number between 1 and 50: ");
            int guess = input.nextInt();

            if (guess == value) {
                System.out.println("Correct!");
                break;
            } else if (guess < value) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high!");
            }
        }
    }
}