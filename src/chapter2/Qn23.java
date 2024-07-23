package chapter2;

import java.util.Scanner;
public class Qn23 {
//     (Cost of driving) Write a program that prompts the user to enter the distance to
//    drive, the fuel efficiency of the car in miles per gallon, and the price per gallon
//    then displays the cost of the trip.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");
        double distance = scanner.nextDouble();
        System.out.println("Enter miles per gallon: ");
        double perGallon = scanner.nextDouble();
        System.out.println("Enter price per gallon: ");
        double price = scanner.nextDouble();

        double cost = (distance / perGallon) * price;
        System.out.println("The trip will cost you: "+cost);
    }
}
