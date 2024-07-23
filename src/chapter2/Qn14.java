package chapter2;

import java.util.Scanner;
public class Qn14 {
//    (Health application: computing BMI) Body Mass Index (BMI) is a measure of
//    health on weight. It can be calculated by taking your weight in kilograms and dividing,
//    by the square of your height in meters. Write a program that prompts the user to
//    enter a weight in pounds and height in inches and displays the BMI. Note one pound
//    is 0.45359237 kilograms and one inch is 0.0254 meters.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in pounds: ");
        double weight = scanner.nextDouble() * 0.45359237;
        System.out.println("Enter you height in inches: ");
        double height = scanner.nextDouble() * 0.0254;

        double bmi = weight / Math.pow(height, 2);
        System.out.println("Your BMI is: "+ bmi);
    }
}
