package chapter2;

import java.util.Scanner;
public class Qn13 {
//     (Financial application: compound value) Suppose you save $100 each month into
//    a savings account with an annual interest rate of 5%. Thus, the monthly interest
//    rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
//    100 * (1 + 0.00417) = 100.417
//    After the second month, the value in the account becomes
//            (100 + 100.417) * (1 + 0.00417) = 201.252
//    After the third month, the value in the account becomes
//            (100 + 201.252) * (1 + 0.00417) = 302.507
//    and so on.
//    Write a program that prompts the user to enter a monthly saving amount and displays
//    the account value after the sixth month. (In Programming Exercise 5.30, you
//    will use a loop to simplify the code and display the account value for any month.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your monthly saving amount: ");
        double saving = scanner.nextDouble();

        double rate = 0.00417;

        double oneMonth = saving + (saving * rate);
        double newBalance = saving + oneMonth;
        double twoMonths = newBalance + (newBalance * rate);
        newBalance = saving + twoMonths;
        double threeMonths = newBalance + (newBalance * rate);
        newBalance = saving + threeMonths;
        double fourMonths = newBalance + (newBalance * rate);
        newBalance = saving + fourMonths;
        double fiveMonths = newBalance + (newBalance * rate);
        newBalance = saving + fiveMonths;
        double sixMonths = newBalance + (newBalance * rate);

        System.out.println(sixMonths);
    }
}
