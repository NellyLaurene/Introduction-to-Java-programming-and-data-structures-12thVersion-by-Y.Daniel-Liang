package chapter2;

import java.util.Scanner;
public class Qn12 {
// (Physics: finding runway length) Given an airplane’s acceleration a and take-off
//    speed v, you can compute the minimum runway length needed for an airplane to
//    take off using the following formula:
//    length = v^2 / 2a
//    Write a program that prompts the user to enter v in meters/second (m/s) and
//    the acceleration a in meters/second squared (m/s^2), then, displays the minimum
//    runway length.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the speed and acceleration in meters per second: ");
        double v = scanner.nextDouble();
        double a = scanner.nextDouble();

        double length = Math.pow(v, 2) / (2 * a);
        System.out.println("The runway length is: "+length);
    }
}
