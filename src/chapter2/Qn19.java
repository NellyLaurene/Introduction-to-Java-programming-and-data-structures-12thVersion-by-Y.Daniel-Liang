package chapter2;

import java.util.Scanner;
public class Qn19 {
//     (Geometry: area of a triangle) Write a program that prompts the user to enter
//    three points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays
//    its area. The formula for computing the area of a triangle is
//            s = (side1 + side2 + side3)/2;
//    area = square root(s(s - side1)(s - side2)(s - side3))

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 6 point of the triangle (x1,y1,x2,y2,x3,y3) respectively: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double side1 = Math.pow( (Math.pow(x2-x1,2) + Math.pow(y2-y1,2) ) ,0.5);
        double side2 = Math.pow( (Math.pow(x3-x2,2) + Math.pow(y3-y2,2) ) ,0.5);
        double side3 = Math.pow( (Math.pow(x3-x1,2) + Math.pow(y3-y1,2) ) ,0.5);

        double s = (side1 + side2 + side3)/2;
        double area = Math.pow( (s*(s - side1)*(s - side2)*(s - side3) ), 0.5);
        System.out.println("The area is: "+ area);

//        1.5  -3.4  4.6  5  9.5  -3.4  = 33.6
    }
}
