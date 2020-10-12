package exercise.Exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner parity = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = parity.nextInt();
        if (integer % 2 == 0) {
            System.out.println("\n" + "Even.");
        }
        else {
            System.out.println("\n" + "Odd.");
        }
        parity.close();
    }
}