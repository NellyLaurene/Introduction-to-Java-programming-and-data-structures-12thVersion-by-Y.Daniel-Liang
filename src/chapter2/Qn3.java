package chapter2;

import java.util.Scanner;
public class Qn3 {
//    (Convert feet into meters) Write a program that reads a number in feet, converts it
//    to meters, and displays the result. One foot is 0.305 meter.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the length in feet: ");
        double feet = scanner.nextDouble();

        double meters = 0.305 * feet;
        System.out.println("Your length in meters is: " + meters);
    }
}
