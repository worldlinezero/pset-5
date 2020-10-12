package exercise.Exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        double numeric = grade.nextDouble();
        if (Math.rint(numeric) > 90 && Math.rint(numeric) <= 100) {
            System.out.println("\n" + "You received an A.");
        }
        else if (Math.rint(numeric) > 80 && Math.rint(numeric) <= 89) {
            System.out.println("\n" + "You received a B.");
        }
        else if (Math.rint(numeric) > 70 && Math.rint(numeric) <= 79) {
            System.out.println("\n" + "You received a C.");
        }
        else if (Math.rint(numeric) > 60 && Math.rint(numeric) <= 69) {
            System.out.println("\n" + "You received a D.");
        }
        else if (Math.rint(numeric) >= 0 && Math.rint(numeric) <= 59) {
            System.out.println("\n" + "You received an F.");
        }
        else if (Math.rint(numeric) > 100 ){
            System.out.println("\n" + "Grades higher than 100 are invalid.");
        }
        else if (Math.rint(numeric) < 0 ){
            System.out.println("\n" + "Grades lower than 0 are invalid.");
        }
        grade.close();
    }
}