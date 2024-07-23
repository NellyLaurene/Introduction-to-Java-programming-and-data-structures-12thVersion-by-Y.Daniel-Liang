package chapter3;

import java.util.Scanner;

public class Qn24 {
//    the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
//              Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomCards = (int)(Math.random()*13+1);
        int clubs = (int)(Math.random()*4+1);
        
        String rank = "";
        String groups = "";

        switch (randomCards){
            case 1 -> rank = "Ace";
            case 2 -> rank = "2";
            case 3 -> rank = "3";
            case 4 -> rank = "4";
            case 5 -> rank = "5";
            case 6 -> rank = "6";
            case 7 -> rank = "7";
            case 8 -> rank = "8";
            case 9 -> rank = "9";
            case 10 -> rank = "10";
            case 11 -> rank = "Jack";
            case 12 -> rank = "Queen";
            case 13 -> rank = "King";
            default -> rank = "invalid";
        }

        switch (clubs){
            case 1 -> groups = "Clubs";
            case 2 -> groups = "Diamonds";
            case 3 -> groups = "Hearts";
            case 4 -> groups = "Spades";
            default -> groups = "Invalid";
        }

        System.out.println("You picked "+rank+" of "+groups);
    }
}
