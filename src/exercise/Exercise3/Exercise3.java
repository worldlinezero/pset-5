package exercise.Exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Enter 3 integers." + "\n");
        Scanner order = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int integerOne = order.nextInt();
        System.out.print("Enter integer: ");
        int integerTwo = order.nextInt();
        System.out.print("Enter integer: ");
        int integerThree = order.nextInt();
        if (integerTwo > integerOne && integerThree > integerTwo) {
            System.out.println("Strictly increasing.");
        }
        else if (integerTwo == integerOne && integerThree == integerTwo) {
            System.out.println("Same.");
        }
        else if (integerTwo >= integerOne && integerThree >= integerTwo) {
            System.out.println("Increasing.");
        }
        else if (integerTwo < integerOne && integerThree < integerTwo) {
            System.out.println("Strictly decreasing.");
        }
        else if (integerTwo <= integerOne && integerThree <= integerTwo) {
            System.out.println("Decreasing.");
        }
        else {
            System.out.println("Unordered.");
        }
        order.close();
    }
}