package chapter2;

import java.util.Scanner;
public class Qn21 {
//    (Financial application: calculate future investment value) Write a program that
//    reads in investment amount, annual interest rate, and number of years and displays
//    the future investment value using the following formula:
//    futureInvestmentValue = (investmentAmount * (1 + monthlyInterestRate)) ^ numberOfYears*12
//    For example, if you enter amount 1000, annual interest rate 3.25%, and number
//    of years 1, the future investment value is 1032.98.

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the investment amount: ");
        double amount = scanner.nextDouble();
        System.out.println("Enter the annual interest percentage and the number of years: ");
        double annualInterest = scanner.nextDouble();
        double years = scanner.nextDouble();

        double monthlyInterest = annualInterest/ 1200;

        double futureInvestment = amount * Math.pow( 1 + monthlyInterest, (years*12) );
        //double futureInvestment = amount * Math.pow(1 + monthlyInterestRate, years * 12);

        System.out.println("Your future investment is: "+ futureInvestment);
    }
}
