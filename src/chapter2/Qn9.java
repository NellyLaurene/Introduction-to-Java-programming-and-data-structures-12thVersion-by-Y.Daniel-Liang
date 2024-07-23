package chapter2;

import java.util.Scanner;
public class Qn9 {
//    (Physics: acceleration) Average acceleration is defined as the change of velocity
//    divided by the time taken to make the change, as given by the following formula:
//    a = v1 - v0
//            t
//    Write a program that prompts the user to enter the starting velocity v0 in meters/
//    second, the ending velocity v1 in meters/second, and the time span t in seconds,
//    then displays the average acceleration.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting velocity in meters per seconds: ");
        double v0 = scanner.nextDouble();
        System.out.println("Enter the ending velocity in meters per seconds: ");
        double v1 = scanner.nextDouble();
        System.out.println("Enter the time span in seconds: ");
        double t = scanner.nextDouble();

        double acceleration = (v1 - v0) / t;
        System.out.println("The acceleration is " + acceleration);
    }
}
