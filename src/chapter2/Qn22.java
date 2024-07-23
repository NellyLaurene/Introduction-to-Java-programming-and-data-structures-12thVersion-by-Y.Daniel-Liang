package chapter2;

import java.util.Scanner;
public class Qn22 {
//     (Financial application: monetary units) Rewrite Listing 2.10,
//    ComputeChange.java, to fix the possible loss of accuracy when converting
//    a double value to an int value. Enter the input as an integer whose last
//    two digits represent the cents. For example, the input 1156 represents 11
//    dollars and 56 cents.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount where the last two digits represent the cents");
        int money = scanner.nextInt();

        int dollars = money / 100;
        int remainingCents = money % 100;

        System.out.println("You have "+dollars+" dollars and "+remainingCents+" cents");
    }
}
