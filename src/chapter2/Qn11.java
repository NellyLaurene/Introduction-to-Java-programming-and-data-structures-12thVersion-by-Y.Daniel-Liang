package chapter2;

import java.util.Scanner;
public class Qn11 {
//     (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
//    to enter the number of years and display the population after the number of years.
//    Use the hint in Programming Exercise 1.11 for this program.

    //        1.11 (Population projection) The U.S. Census Bureau projects population based on
    //    the following assumptions:
    //              ■ One birth every 7 seconds
    //              ■ One death every 13 seconds
    //              ■ One new immigrant every 45 seconds
    //    Write a program to display the population for each of the next five years. Assume
    //    that the current population is 312,032,486, and one year has 365 days.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int currentPopulation = 312_032_486;

        System.out.println("Enter the number of years: ");
        int years = scanner.nextInt();

        int seconds = years * 31536000;

        int newBirth = seconds / 7;
        int newDeath = seconds / 13;
        int newImmigrant = seconds / 45;

        int newPopulation = (currentPopulation - newDeath) + newBirth + newImmigrant;
        System.out.println("The population after " +years+ "years is "+newPopulation);
    }
}