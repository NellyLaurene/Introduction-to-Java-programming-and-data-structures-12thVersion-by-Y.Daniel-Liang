package chapter2;

import java.util.Scanner;
public class Qn2 {
//    (Compute the volume of a cylinder) Write a program that reads in the radius
//    and length of a cylinder and computes the area and volume using the following
//    formulas:
//    area = radius * radius * π
//            volume = area * length

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius and the length of a cylinder respectively: ");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();

        final double PI = 3.14;

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("The area is: " + area);
        System.out.println("The volume is: " + volume);
    }
}
