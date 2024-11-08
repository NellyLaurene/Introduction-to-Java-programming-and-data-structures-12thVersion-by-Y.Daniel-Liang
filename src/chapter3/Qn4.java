package chapter3;

import java.util.Scanner;

public class Qn4 {
//     (Random month) Write a program that randomly generates an integer between 1
//    and 12 and displays the English month names January, February, . . . , December
//for the numbers 1, 2, . . . , 12, accordingly.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomMonth = (int)(Math.random()*12+1);

        switch (randomMonth){
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid month");
        }

    }
}

