package chapter2;

import java.util.Scanner;
public class Qn7 {
//    (Find the number of years) Write a program that prompts the user to enter the
//    minutes (e.g., 1 billion), and displays the maximum number of years and
//    remaining days for the minutes. For simplicity, assume that a year has 365 days.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of minutes you want: ");
        int minutes = scanner.nextInt();

        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;

         System.out.println(minutes + " Minutes is equal to "+ years+ " Years and " + days + " days.");
    }
}