package chapter3;

import java.util.Scanner;

public class Qn7 {
//     (Financial application: monetary units) Modify Listing 2.10, ComputeChange.
//            java, to display the nonzero denominations only, using singular words for single
//    units such as 1 dollar and 1 penny, and plural words for more than one unit such
//    as 2 dollars and 3 pennies.
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of money in decimal: ");
        double amount = scanner.nextDouble();

        int totalCents = (int) Math.round(amount * 100);

        int dollars = totalCents / 100;
        int remainingCents = totalCents % 100;

        int quarters = remainingCents / 25;
        remainingCents %= 25;

        int dimes = remainingCents / 10;
        remainingCents %= 10;

        int nickels = remainingCents / 5;
        remainingCents %= 5;

        int pennies = remainingCents;

        if(dollars > 1 && pennies > 1)
            System.out.println(dollars+"dollars "+pennies+" pennies");
        if(dollars > 1 && pennies ==1 )
            System.out.println(dollars+"dollars "+pennies+" penny");
        if (dollars == 1 && pennies == 1)
            System.out.println(dollars+"dollar "+pennies+" penny");
        if(dollars == 1 && pennies > 1)
            System.out.println(dollars+"dollar "+pennies+" pennies");
    }
}
