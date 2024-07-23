package chapter2;

import java.util.Scanner;
public class Qn16 {
//     (Geometry: area of a hexagon) Write a program that prompts the user to enter the
//    side of a hexagon and displays its area. The formula for computing the area of a
//    hexagon is
//    Area = (3sqrt(3)/ 2)s^2
//        ,
//    where s is the length of a side.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side of a hexagon: ");
        double side = scanner.nextDouble();

        double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2);
        System.out.println("The area is: "+ area);
    }
}
