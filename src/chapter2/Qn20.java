package chapter2;

import java.util.Scanner;
public class Qn20 {
//    Financial application: calculate interest) If you know the balance and the annual
//    percentage interest rate, you can compute the interest on the next monthly
//    payment using the following formula:
//    interest = balance * (annualInterestRate/1200)
//    Write a program that reads the balance and the annual percentage interest rate
//    and displays the interest for the next month.

    public static void main(String[] main){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the balance amount: ");
        double balance = scanner.nextDouble();
        System.out.println("Enter the annual percentage interest rate: ");
        double annualRate = scanner.nextDouble();

        double interest = balance * (annualRate/1200);

        System.out.println("The interest for the next month is: "+ interest);

    }
}
