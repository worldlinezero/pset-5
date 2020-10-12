package exercise.Exercise6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner card = new Scanner(System.in);
        System.out.print("Enter a playing card: ");
        String suitAndNumber = card.nextLine();
        card.close();
        int length = suitAndNumber.length();
        String numberOrFace = suitAndNumber.substring(0, 1);
        String suit = suitAndNumber.substring(1, length);
        switch (numberOrFace){
            case "2":
                numberOrFace = "Two";
                break;
            case "3":
                numberOrFace = "Three";
                break;
            case "4":
                numberOrFace = "Four";
                break;
            case "5":
                numberOrFace = "Five";
                break;
            case "6":
                numberOrFace = "Six";
                break;
            case "7":
                numberOrFace = "Seven";
                break;
            case "8":
                numberOrFace = "Eight";
                break;
            case "9":
                numberOrFace = "Nine";
                break;
            case "T":
                numberOrFace = "Ten";
                break;
            case "J":
                numberOrFace = "Jack";
                break;
            case "Q":
                numberOrFace = "Queen";
                break;
            case "K":
                numberOrFace = "King";
                break;
            case "A":
                numberOrFace = "Ace";
                break;
            default:
                numberOrFace = null;
        }
        switch (suit) {
            case "C":
                suit = "Clubs";
                break;
            case "D":
                suit = "Diamonds";
                break;
            case "H":
                suit = "Hearts";
                break;
            case "S":
                suit = "Spades";
                break;
            default:
                suit = "";
        }
        if (!suit.equals("") && numberOrFace != null) {
            System.out.println("\n" + numberOrFace + " of " + suit + ".");
        }
        else {
            if (numberOrFace == null) {
                System.out.println("\n" + "That's not a valid rank.");
            }
            else if (suit.equals("")) {
                System.out.println("\n" + "That's not a valid suit.");
            }
        }
    }
}