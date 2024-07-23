package chapter2;

import java.util.Scanner;
public class Qn5 {
//    (Financial application: calculate tips) Write a program that reads the subtotal
//    and the gratuity rate, then computes the gratuity and total. For example, if the
//    user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
//    as gratuity and $11.5 as total.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the subtotal and the gratuity respectively: ");
        double subtotal = scanner.nextDouble();
        double gratuity = scanner.nextDouble();

        double newGratuity = gratuity / 10;
        double newSubtotal = subtotal + newGratuity;

        System.out.println("The new subtotal is: $"+newSubtotal+" and the new gratuity is: $"+newGratuity);

    }
}
