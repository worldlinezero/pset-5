package exercise.Exercise9;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner hasSeptember = new Scanner(System.in);
        System.out.print("Enter a month: ");
        String month = hasSeptember.nextLine();
        if (month.equals("January") || month.equals("january") || month.equals("Jan") || month.equals("jan") || month.equals("Janu") || month.equals("janu")) {
            System.out.println("\n" + "31 days.");
        }
        else if (month.equals("February") || month.equals("february") || month.equals("Feb") || month.equals("feb") || month.equals("Febu") || month.equals("febu")) {
            System.out.println("\n" + "28 or 29 days.");
        }
        else if (month.equals("March") || month.equals("march") || month.equals("Mar") || month.equals("mar") || month.equals("Marc") || month.equals("marc")) {
            System.out.println("\n" + "31 days.");
        }
        else if (month.equals("April") || month.equals("april") || month.equals("Apr") || month.equals("apr") || month.equals("Apri") || month.equals("apri")) {
            System.out.println("\n" + "30 days.");
        }
        else if (month.equals("May") || month.equals("may")) {
            System.out.println("\n" + "31 days.");
        }
        else if (month.equals("June") || month.equals("june") || month.equals("Jun") || month.equals("jun")) {
            System.out.println("\n" + "30 days.");
        }
        else if (month.equals("July") || month.equals("july") || month.equals("Jul") || month.equals("jul")) {
            System.out.println("\n" + "31 days.");
        }
        else if (month.equals("August") || month.equals("august") || month.equals("Aug") || month.equals("aug") || month.equals("Augu") || month.equals("augu")) {
            System.out.println("\n" + "31 days.");
        }
        else if (month.equals("September") || month.equals("september") || month.equals("Sep") || month.equals("sep") || month.equals("Sept") || month.equals("sept")) {
            System.out.println("\n" + "30 days.");
        }
        else if (month.equals("October") || month.equals("october") || month.equals("Oct") || month.equals("oct") || month.equals("Octo") || month.equals("octo")) {
            System.out.println("\n" + "31 days.");
        }
        else if (month.equals("November") || month.equals("november") || month.equals("Nov") || month.equals("nov") || month.equals("Nove") || month.equals("nove")) {
            System.out.println("\n" + "30 days.");
        }
        else if (month.equals("December") || month.equals("december") || month.equals("Dec") || month.equals("dec") || month.equals("Dece") || month.equals("dece")) {
            System.out.println("\n" + "31 days.");
        }
        else {
            System.out.println("\n" + "That's not a valid month.");
        }
    }
}