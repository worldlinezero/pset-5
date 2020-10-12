package exercise.Exercise8;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner phase = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        String tempAndSys = phase.nextLine();
        String temp = tempAndSys.substring(0, tempAndSys.indexOf(' '));
        double temperature = Double.parseDouble(temp);
        String system = tempAndSys.substring(tempAndSys.indexOf(' ') + 1);
        if (system.equals("F") || system.equals("f")) {
            if (temperature <= 32) {
                System.out.println("\n" + "Solid.");
            }
            else if (temperature < 212) {
                System.out.println("\n" + "Liquid.");
            }
            else
            {
                System.out.println("\n" + "Gas.");
            }
        }
        else if (system.equals("C") || system.equals("c")){
            if (temperature <= 0) {
                System.out.println("\n" + "Solid.");
            }
            else if (temperature < 100) {
                System.out.println("\n" + "Liquid.");
            }
            else {
                System.out.println("\n" + "Gas.");
            }
        }
        else {
            System.out.println(" ");
            System.out.println("That's not a valid scale.");
        }

        phase.close();
    }
}