package a_conversion.conversion_exercises;

import java.util.Scanner;

public class CalcMax {

    /**
     * Gets a number from the user.
     *
     * The user is required to keep entering data until a valid integer is supplied
     * @param prompt The prompt text displayed to the user
     * @return The first valid integer entered by the user
     */
    // @staticmethod
    // def getValidInteger(prompt: str) -> int:
    public static int getValidInteger(String prompt){
        Scanner input = new Scanner(System.in);

        int value = 0;
        while(true) {
            System.out.println(prompt);
            if (input.hasNextInt()) {
                value = input.nextInt();
                break;
            } else {
                System.out.println("Please enter an _integer_");
                input.nextLine();
            }
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(getValidInteger("Enter an integer"));
    }
}
