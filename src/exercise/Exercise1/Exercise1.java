package exercise.Exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner polarity = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = polarity.nextInt();
        if (integer > 0) {
            System.out.println("\n" + "Positive.");
        }
        else if (integer < 0) {
            System.out.println("\n" + "Negative.");
        }
        else {
            System.out.println("\n" + "Neither.");
        }
        polarity.close();
    }
}
