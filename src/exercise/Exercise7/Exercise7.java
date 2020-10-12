package exercise.Exercise7;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner leapYear = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = leapYear.nextInt();
        if (year % 4 == 0 && year > 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("\n" + year + " is a leap year.");
                }
                else {
                    System.out.println("\n" + year + " is a not leap year.");
                }
            }
            else {
                System.out.println("\n" + year + " is a not leap year.");
            }
        }
        else {
            System.out.println("\n" + year + " is not a leap year.");
        }
        leapYear.close();
    }
}