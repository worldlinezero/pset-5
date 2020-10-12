package exercise.Exercise4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner gradePoint = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String letter = gradePoint.nextLine();
        String aPlus = "A+";
        String a = "A";
        String aMinus = "A-";
        String bPlus = "B+";
        String b = "B";
        String bMinus = "B-";
        String cPlus = "C+";
        String c = "C";
        String cMinus = "C-";
        String dPlus = "D+";
        String d = "D";
        String dMinus = "D-";
        String f = "F";
        if (letter.equals(aPlus)) {
            System.out.println("\n" + "Your GPA is 4.00.");
        }
        else if (letter.equals(a)) {
            System.out.println("\n" + "Your GPA is 4.00.");
        }
        else if (letter.equals(aMinus)) {
            System.out.println("\n" + "Your GPA is 3.67.");
        }
        else if (letter.equals(bPlus)) {
            System.out.println("\n" + "Your GPA is 3.33.");
        }
        else if (letter.equals(b)) {
            System.out.println("\n" + "Your GPA is 3.00.");
        }
        else if (letter.equals(bMinus)) {
            System.out.println("\n" + "Your GPA is 2.67.");
        }
        else if (letter.equals(cPlus)) {
            System.out.println("\n" + "Your GPA is 2.33.");
        }
        else if (letter.equals(c)) {
            System.out.println("\n" + "Your GPA is 2.00.");
        }
        else if (letter.equals(cMinus)) {
            System.out.println("\n" + "Your GPA is 1.67.");
        }
        else if (letter.equals(dPlus)) {
            System.out.println("\n" + "Your GPA is 1.33.");
        }
        else if (letter.equals(d)) {
            System.out.println("\n" + "Your GPA is 1.00.");
        }
        else if (letter.equals(dMinus)) {
            System.out.println("\n" + "Your GPA is 0.67.");
        }
        else if (letter.equals(f)){
            System.out.println("\n" + "Your GPA is 0.00.");
        }
        else {
            System.out.println("\n" + "That's not a valid letter grade.");
        }
        gradePoint.close();
    }
}