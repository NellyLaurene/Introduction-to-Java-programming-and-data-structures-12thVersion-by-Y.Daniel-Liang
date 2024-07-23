package chapter2;

import java.util.Scanner;
public class Qn4 {
//    (Convert pounds into kilograms) Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it
//    to kilograms, and displays the result. One pound is 0.454 kilogram.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the weight in pounds: ");
        double pounds = scanner.nextDouble();

        double kilograms = 0.454 * pounds;
        System.out.println("The weight in kilograms is: " + kilograms +"KG");
    }
}
