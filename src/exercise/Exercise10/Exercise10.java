package exercise.Exercise10;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner salary = new Scanner(System.in);
        System.out.print("Enter wage: ");
        double wage = salary.nextDouble();
        System.out.print("Enter hours worked: ");
        double hours = salary.nextDouble();
        if (wage <= 0) {
            System.out.println("\n" + "Your wage must be greater than or equal to $0.00/hour.");
        }
        else if (hours <= 0) {
            System.out.println("\n" + "Your hours must be greater than or equal to 0.0.");
        }
        else {
            System.out.print("\n" + "You'll make ");
            if (hours <= 40) {
                System.out.printf("%,.2f", (wage * hours));
            }
            else {
                System.out.printf("%,.2f", (((hours - 40) * (1.5 * wage)) + (40 * wage)));
            }
            System.out.print(" this week.");
        }
        salary.close();
    }
}